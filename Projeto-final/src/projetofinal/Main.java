package projetofinal;
import projetofinal.concorrencia.ProcessadorPacoteThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o SecureTraffic Analyzer...");

        // Simulando a leitura de arquivos
        String[] pacotesMock = {"PacoteA", "PacoteB", "PacoteC", "PacoteD", "PacoteE"};

        // Disparando as Threads simultaneamente
        for (int i = 0; i < pacotesMock.length; i++) {
            ProcessadorPacoteThread processador = new ProcessadorPacoteThread(i, pacotesMock[i]);
            Thread thread = new Thread(processador);
            thread.start();
        }

        System.out.println("Todos os pacotes foram enviados para processamento paralelo!");
    }
}