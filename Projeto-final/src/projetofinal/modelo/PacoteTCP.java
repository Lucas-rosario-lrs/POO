package projetofinal.modelo;

public class PacoteTCP extends PacoteRede {
    protected boolean isAck;

    public PacoteTCP(int id, String ipOrigem, String ipDestino, String payload, boolean isAck) {
        super(id, ipOrigem, ipDestino, payload);
        this.isAck = isAck;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--Pacote TCP--");
        System.out.println("ID: " + id);
        System.out.println("IP de Origem: " + ipOrigem);
        System.out.println("IP de Destino: " + ipDestino);
        System.out.println("Payload: " + payload);
        System.out.println("ACK: " + isAck);
    }
}
