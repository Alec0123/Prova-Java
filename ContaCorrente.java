public class ContaCorrente extends Conta {
    private double taxaManutencao;
    private double limiteCredito;

    public ContaCorrente(int numero, int agencia, String nomeTitular, String senha, double saldo, double taxaManutencao, double limiteCredito) {
        super(numero, agencia, nomeTitular, senha, saldo);
        this.limiteCredito = limiteCredito;
        this.taxaManutencao = taxaManutencao;
    }

    public double debitarManutencao() throws ExcecaoSaldoInsuficiente{
        double valor = taxaManutencao;
        if (saldo + limiteCredito >= valor) {
            saldo -= valor;
        } else{
            throw new ExcecaoSaldoInsuficiente(numero);
        }
        return saldo;
    }

    public void retirar(double valor, String senha, int numero) 
        throws ExcecaoSenhaInvalida, ExcecaoSaldoInsuficiente, ExcecaoContaInvalida {
        
        if(!this.senha.equals(senha)) {
            throw new ExcecaoSenhaInvalida(this.numero);
        }

        if(this.saldo <= 0.0) {
            throw new ExcecaoSaldoInsuficiente(numero);
        }

        if((this.saldo - valor) < 0.0) {
            throw new ExcecaoSaldoInsuficiente(numero);
        }

        if(this.numero != numero){
            throw new ExcecaoContaInvalida(numero);
        }

        this.saldo -= valor;
    }

    @Override
    public void mostrar() {}
}