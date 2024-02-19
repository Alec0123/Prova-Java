import java.util.ArrayList;

public class Banco extends Conta{
  public String nome;
  private ArrayList<Conta> contas;

  public Banco(String nome, int numero, String nomeTitular, int agencia,String senha, double saldo){
    super(numero, agencia, nomeTitular, senha, saldo);
    this.nome = nome;
    contas = new ArrayList<>();
  }

  public void adicionarConta(Conta cont) {
    contas.add(cont);
  }

  public void mostrar(){
    for (Conta contas : contas ) {
        System.out.println("Numero conta: " + contas.numero);
        System.out.println("Agencia: " + contas.agencia);
        System.out.println("Nome titular: " + contas.nomeTitular);
        System.out.println("Saldo: " + contas.saldo);
        System.out.println("Senha: " + contas.senha  + "\n");
    }
  }
}