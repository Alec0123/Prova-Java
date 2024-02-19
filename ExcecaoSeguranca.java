public abstract class ExcecaoSeguranca extends Exception {
    public ExcecaoSeguranca() {}

    public ExcecaoSeguranca(String msg) {
        super(msg);
    }
}
