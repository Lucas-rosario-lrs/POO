package projetofinal.concorrencia;

public class ProcessadorPacoteThread implements Runnable {
//criação da estrutura esqueleto
    private String dadosFicticios; // Trocar por PacoteRede após os colegas fazerem o codigo
    private int idThread;

    public ProcessadorPacoteThread(int idThread, String dadosFicticios) {
        this.idThread = idThread;
        this.dadosFicticios = dadosFicticios;
    }

    @Override
    public void run() {
        System.out.println("Thread [" + idThread + "] iniciou o processamento...");

        try {
            // Simulando o tempo de processamento da criptografia
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread [" + idThread + "] finalizou! Dados seguros: ***" + dadosFicticios + "***");
    }
}
