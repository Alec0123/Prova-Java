public class Main {
    public static void main(String[] args) throws ExcecaoContaInvalida, ExcecaoSaldoInsuficiente {
        ContaCorrente contaCorrente = new ContaCorrente(123, 456, "Alexandre", "senha123", 10000, 10, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(789, 456, "Carolina", "senha456", 5000, 5);
        
        Banco banco = new Banco("Banco Kogut", 0, "", 0, "", 0);
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);
        
        System.out.println("======== Conta antes de modificações ========");
        banco.mostrar();
        System.out.println("================");

        System.out.println("======== Conta corrente apos debito de manutenção ========");
        double novoSaldo = contaCorrente.debitarManutencao();
        System.out.println("O saldo da conta corrente após a Manutenção é: " + novoSaldo);
        System.out.println("================");

        System.out.println("======== Conta poupança após debitar o rendimento ========");
        double novSaldo = contaPoupanca.debitarRendimento();
        System.out.println("O saldo da conta poupança após debitar o rendimento é: " + novSaldo);
        System.out.println("================");



        //retirar corrente com senha invalida
        System.out.println("======= Tentantiva retirar conta corrente com senha invalida ========");
        try {
            contaCorrente.retirar(2000, "senha12", 123);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoSaldoInsuficiente e) {
            System.out.println("Saldo insuficiente");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");

        //retirar corrente com saldo insuficiente
        System.out.println("======= Tentantiva retirar conta poupança com saldo insuficiente ========");
        try {
            contaCorrente.retirar(100000, "senha123", 789);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoSaldoInsuficiente e) {
            System.out.println("Saldo insuficiente");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");

        //retirar corrente conta invalida
        System.out.println("======= Tentantiva retirar conta corrente com conta invalida ========");
        try {
            contaCorrente.retirar(2000, "senha123", 9);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoSaldoInsuficiente e) {
            System.out.println("Saldo insuficiente");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");




        //retirar poupança
        System.out.println("======= Tentantiva retirar conta poupança com senha invalida ========");
        try {
            contaPoupanca.retirar(2000, "senha12", 789);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoSaldoInsuficiente e) {
            System.out.println("Saldo insuficiente");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");
        
        System.out.println("======= Tentantiva retirar conta poupança com saldo insuficiente ========");
        try {
            contaPoupanca.retirar(100000, "senha456", 789);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoSaldoInsuficiente e) {
            System.out.println("Saldo insuficiente");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");

        System.out.println("======= Tentantiva retirar conta poupança com conta invalida ========");
        try {
            contaPoupanca.retirar(2000, "senha456", 9);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoSaldoInsuficiente e) {
            System.out.println("Saldo insuficiente");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");



        //Conta corrente deposito
        System.out.println("======= Tentantiva depositar conta corrente com conta invalida ========");
        try {
            contaCorrente.depositar(2000, "senha123", 9);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");

        System.out.println("======= Tentantiva depositar conta corrente com senha invalida ========");
        try {
            contaCorrente.depositar(2000, "senha12", 123);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");



        //Conta poupança deposito
        System.out.println("======= Tentantiva depositar conta poupança com conta invalida ========");
        try {
            contaPoupanca.depositar(2000, "senha456", 9);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");

        System.out.println("======= Tentantiva depositar conta corrente com senha invalida ========");
        try {
            contaPoupanca.depositar(2000, "senha45", 123);
        } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Senha inválida");
        } catch (ExcecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }
        System.out.println("================");


    }
}