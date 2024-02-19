public class ContaPoupanca extends Conta {
    public double TaxaRendimento;

    public ContaPoupanca(int numero, int agencia, String nomeTitular, String senha, double saldo, double taxaRendimento) {
        super(numero, agencia, nomeTitular, senha, saldo);
        this.TaxaRendimento = taxaRendimento;
    }

    public double debitarRendimento(){
        double valor = TaxaRendimento;
        return saldo += valor;
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
    public void mostrar(){}
}
