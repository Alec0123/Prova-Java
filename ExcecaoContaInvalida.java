public class ExcecaoContaInvalida extends ExcecaoAutenticacao {
    public ExcecaoContaInvalida() {}

    public ExcecaoContaInvalida(int numero) {
        super("A conta " + numero + " é inválida");
    } 
}
