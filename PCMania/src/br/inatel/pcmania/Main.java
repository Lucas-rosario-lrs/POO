package br.inatel.pcmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lucas Rosario - GET - 9842 --
        int matricula = 9842;

        // --- INICIALIZAÇÃO DA PROMOÇÃO 1 ---
        // 1. Criando as instâncias independentes que farão parte da COMPOSIÇÃO
        HardwareBasico[] hw1 = new HardwareBasico[3];
        hw1[0] = new HardwareBasico("Pentium Core i3", 2200);
        hw1[1] = new HardwareBasico("Memória RAM", 8);
        hw1[2] = new HardwareBasico("HD", 500);
        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
        Computador pc1 = new Computador("Apple", matricula, so1, hw1); //instanciação
        pc1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));

        // --- INICIALIZAÇÃO DA PROMOÇÃO 2 ---
        HardwareBasico[] hw2 = new HardwareBasico[3];
        hw2[0] = new HardwareBasico("Pentium Core i5", 3370);
        hw2[1] = new HardwareBasico("Memória RAM", 16);
        hw2[2] = new HardwareBasico("HD", 1000); // 1Tb = 1000Gb
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        Computador pc2 = new Computador("Samsung", matricula - 1234, so2, hw2);
        pc2.addMemoriaUSB(new MemoriaUSB("Pendrive", 32));

        // --- INICIALIZAÇÃO DA PROMOÇÃO 3 ---
        HardwareBasico[] hw3 = new HardwareBasico[3];
        hw3[0] = new HardwareBasico("Pentium Core i7", 4500);
        hw3[1] = new HardwareBasico("Memória RAM", 32);
        hw3[2] = new HardwareBasico("HD", 2000); // 2Tb = 2000Gb
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
        Computador pc3 = new Computador("Dell", matricula + 5678, so3, hw3);
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // --- FLUXO DO CLIENTE ---
        System.out.println("Bem-vindo à PC Mania!");
        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Informe seu CPF: ");
        String cpf = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== PROMOÇÕES DISPONÍVEIS =====");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.println("0 - Finalizar Compra");
            System.out.print("Digite o código do PC desejado: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cliente.comprarPC(pc1);
                    System.out.println("=> PC Apple adicionado ao carrinho!");
                    break;
                case 2:
                    cliente.comprarPC(pc2);
                    System.out.println("=> PC Samsung adicionado ao carrinho!");
                    break;
                case 3:
                    cliente.comprarPC(pc3);
                    System.out.println("=> PC Dell adicionado ao carrinho!");
                    break;
                case 0:
                    System.out.println("Finalizando compra...\n");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        // --- RESUMO DA COMPRA ---
        System.out.println("=================================");
        System.out.println("        RESUMO DA COMPRA         ");
        System.out.println("=================================");
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        System.out.println("---------------------------------");

        Computador[] pcComprados = cliente.getComputadores();
        boolean fezCompra = false;

        for (int i = 0; i < pcComprados.length; i++) {
            if (pcComprados[i] != null) {
                fezCompra = true;
                System.out.println("Item [" + (i + 1) + "]:");
                pcComprados[i].mostraPCConfigs();
            }
        }

        if (fezCompra) {
            System.out.println("TOTAL DA COMPRA: R$ " + cliente.calculaTotalCompra());
            ProcessarPedido.processar(cliente.getComputadores());
        } else {
            System.out.println("Nenhum item foi comprado.");
        }

        entrada.close();
    }
}