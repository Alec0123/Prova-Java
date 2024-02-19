public class ExcecaoSenhaInvalida extends ExcecaoAutenticacao {
    public ExcecaoSenhaInvalida() {}
    
    public ExcecaoSenhaInvalida(int numero) {
        super("Não foi possível autenticar a conta " + numero);
    }
}