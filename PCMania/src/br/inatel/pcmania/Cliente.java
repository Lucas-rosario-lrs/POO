package br.inatel.pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    // ASSOCIAÇÃO (Seta com nome "compra" na UML)
    // Indica que o Cliente tem um relacionamento com Computador.
    // Multiplicidade 2..* na UML indica que ele pode comprar vários.
    private Computador[] computadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20]; // Array nativo para até 20 compras
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }
        return total;
    }

    public void comprarPC(Computador pc) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = pc;
                break; // Sai do loop após adicionar o primeiro PC no espaço vazio
            }
        }
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public Computador[] getComputadores() { return computadores; }
}