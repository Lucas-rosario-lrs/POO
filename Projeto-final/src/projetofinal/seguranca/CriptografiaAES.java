package projetofinal.seguranca;

public class CriptografiaAES implements ICriptografia {

    @Override
    public String criptografar(String dados) {
        return "[AES_Encriptado] " + dados;
    }

    @Override
    public String descriptografar(String dados) {
        return dados.replace("[AES_Encriptado] ", "");
    }
}