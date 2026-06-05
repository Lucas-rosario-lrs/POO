package projetofinal.seguranca;

public class CriptografiaSimples implements ICriptografia {

    @Override
    public String criptografar(String dados) {
        return new StringBuilder(dados).reverse().toString();
    }

    @Override
    public String descriptografar(String dados) {
        return new StringBuilder(dados).reverse().toString();
    }
}