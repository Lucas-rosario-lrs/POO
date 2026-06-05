package projetofinal.modelo;

public class PacoteUDP extends PacoteRede {
    protected int portaOrigem;

    public PacoteUDP(int id, String ipOrigem, String ipDestino, String payload, int portaOrigem) {
        super(id, ipOrigem, ipDestino, payload);
        this.portaOrigem = portaOrigem;
    }

    public int getPortaOrigem() {
        return this.portaOrigem;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--Pacote UDP--");
        System.out.println("ID: " + id);
        System.out.println("IP de Origem: " + ipOrigem);
        System.out.println("IP de Destino: " + ipDestino);
        System.out.println("Payload: " + payload);
        System.out.println("Porta de Origem: " + portaOrigem);
    }
}