package projetofinal.concorrencia;

import projetofinal.modelo.PacoteRede;
import projetofinal.seguranca.ICriptografia;
import projetofinal.io.GerenciadorArquivo;

public class ProcessadorPacoteThread implements Runnable {
    private int idThread;
    private PacoteRede pacote;
    private ICriptografia motorCripto;
    private GerenciadorArquivo gerenciador;

    // Construtor completo ligando todas as pontas
    public ProcessadorPacoteThread(int idThread, PacoteRede pacote, ICriptografia motor, GerenciadorArquivo gerenciador) {
        this.idThread = idThread;
        this.pacote = pacote;
        this.motorCripto = motor;
        this.gerenciador = gerenciador;
    }

    @Override
    public void run() {
        System.out.println("Thread [" + idThread + "] processando pacote ID: " + pacote.getId());

        String payloadOriginal = pacote.getPayload();
        String payloadSeguro = motorCripto.criptografar(payloadOriginal); // Criptografa
        pacote.setPayload(payloadSeguro); // Atualiza

        gerenciador.salvarLog("logs_processados.txt", pacote); // Salva no arquivo novo

        System.out.println("Thread [" + idThread + "] Finalizada! Payload seguro salvo.");
    }
}