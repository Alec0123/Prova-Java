public class ExcecaoSaldoInsuficiente extends Exception {
    public ExcecaoSaldoInsuficiente(int numero) {
        super("A conta " + numero + " não tem saldo suficiente");
    }
}
