package projetofinal.excecoes;

public class ExcecaoPacoteInvalido extends Exception {

    public ExcecaoPacoteInvalido(String mensagem) {
        super(mensagem);
    }

    public ExcecaoPacoteInvalido(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}