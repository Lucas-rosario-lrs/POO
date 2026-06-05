package projetofinal;

import projetofinal.io.GerenciadorArquivo;
import projetofinal.modelo.PacoteRede;
import projetofinal.excecoes.ExcecaoPacoteInvalido;
import projetofinal.seguranca.ICriptografia;
import projetofinal.seguranca.CriptografiaAES;
import projetofinal.seguranca.CriptografiaSimples;
import projetofinal.concorrencia.ProcessadorPacoteThread;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o SecureTraffic Analyzer...");
        Scanner scanner = new Scanner(System.in);
        GerenciadorArquivo gerenciador = new GerenciadorArquivo();

        // 1. Tratamento de Exceção para a entrada de dados (InputMismatchException)
        int escolha = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("\nEscolha a criptografia (1 para AES, 2 para Simples):");
                escolha = scanner.nextInt();

                // Verifica se o usuário digitou um número fora das opções válidas
                if (escolha == 1 || escolha == 2) {
                    entradaValida = true;
                } else {
                    System.out.println("[AVISO] Opção inválida! Por favor, digite apenas 1 ou 2.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("[ERRO] Você digitou um caractere inválido. Esperava-se um número inteiro.");
                // Limpeza do buffer
                scanner.nextLine();
            }
        }

        ICriptografia motor;
        if (escolha == 1) {
            motor = new CriptografiaAES();
        } else {
            motor = new CriptografiaSimples();
        }

        try {
            System.out.println("\nBuscando pacotes no arquivo logs_trafego.txt...");
            List<PacoteRede> listaPacotes = gerenciador.lerPacotes("logs_trafego.txt");

            for (int i = 0; i < listaPacotes.size(); i++) {
                PacoteRede pacoteReal = listaPacotes.get(i);
                pacoteReal.exibirDetalhes();

                // 2. Dispara a Thread passando TUDO para ela fazer o trabalho paralelo
                ProcessadorPacoteThread processador = new ProcessadorPacoteThread(i, pacoteReal, motor, gerenciador);
                Thread thread = new Thread(processador);
                thread.start();
            }

            System.out.println("\nTodos os pacotes foram enviados para processamento paralelo!");

        } catch (IOException e) {
            System.out.println("[ERRO CRÍTICO] Falha ao abrir arquivo: " + e.getMessage());
        } catch (ExcecaoPacoteInvalido e) {
            System.out.println("[ERRO DE VALIDAÇÃO] Dados corrompidos: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}