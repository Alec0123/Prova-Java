public abstract class Conta {
    public int numero;    
    public int agencia;    
    public String nomeTitular;
    public String senha;
    public double saldo;

  
    public Conta(int numero, int agencia, String nomeTitular, String senha, double saldo) {
      this.nomeTitular = nomeTitular;
      this.numero = numero;
      this.agencia = agencia;
      this.saldo = saldo;
      this.senha = senha;
    }


    public void depositar(double valor, String senha, int numero) 
        throws ExcecaoSenhaInvalida, ExcecaoContaInvalida {{ 
            if(!this.senha.equals(senha)) {
                throw new ExcecaoSenhaInvalida(this.numero);
            }
            if(this.numero != numero){
                throw new ExcecaoContaInvalida(numero);
            }

            this.saldo += valor;
        }}

    
    public abstract void mostrar();
}
