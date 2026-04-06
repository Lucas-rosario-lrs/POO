package br.inatel.pcmania;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional so; //Composição
    private HardwareBasico[] hardwares; //Composição de vetores
    private MemoriaUSB musb; // Agregação

    //Construtor
    public Computador(String marca, float preco, SistemaOperacional so, HardwareBasico[] hardwares) {
        this.marca = marca;
        this.preco = preco;
        this.so = so;
        this.hardwares = hardwares;
    }
    //metodo para consolidar a agregação
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        System.out.println("--- Hardware ---");
        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] != null) {
                // Se a capacidade for maior que 100, assumimos que é Mhz ou Gb de HD, senão Gb de RAM.
                System.out.println(hardwares[i].getNome() + " (" + hardwares[i].getCapacidade() + ")");
            }
        }

        System.out.println("Sistema Operacional: " + so.getNome() + " (" + so.getTipo() + " bits)");

        if (musb != null) {
            System.out.println("Acompanha: " + musb.getNome() + " de " + musb.getCapacidade() + "Gb");
        }
        System.out.println("-------------------------");
    }

    public float getPreco() { return preco; }
}