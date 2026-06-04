package projetofinal.modelo;

public abstract class PacoteRede {
    protected int id;
    protected String ipOrigem;
    protected String ipDestino;
    protected String payload;

    public PacoteRede(int id, String ipOrigem, String ipDestino, String payload) {
        this.id = id;
        this.ipOrigem = ipOrigem;
        this.ipDestino = ipDestino;
        this.payload = payload;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIpOrigem() {
        return ipOrigem;
    }

    public void setIpOrigem(String ipOrigem) {
        this.ipOrigem = ipOrigem;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public abstract void exibirDetalhes();
}
