package projetofinal.modelo;

public class PacoteUDP extends PacoteRede{
    protected int portaOrigem;

    public PacoteUDP(int id, String ipOrigem, String ipDestino, String payload,int portaOrigem) {
        super(id, ipOrigem, ipDestino, payload);
        this.portaOrigem = portaOrigem;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--Pacote UDP--");
        System.out.println("ID: " + id);
        System.out.println("ip de Origem: " + ipOrigem);
        System.out.println("ip de Destino: " + ipDestino);
        System.out.println("Payload: " + payload);
        System.out.println("Porta de Origem: " + portaOrigem);
    }
}
