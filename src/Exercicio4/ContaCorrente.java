package Exercicio4;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private static double saldo;

    public static double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public static void depositoConta(double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Deposito de R$" + valorDeposito + " realizado com sucesso!");
        System.out.println("Saldo atual: R$" + getSaldo());
    }

    public static void saqueConta(double valorSaque) {
        if (saldo < 5) {
            System.out.println("Não poderá sacar o valor");
        } else if (valorSaque > saldo) {
            System.out.println("Valor indisponivel para esse saque.");
        } else {
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
            System.out.println("Saldo atual: R$" + getSaldo());
        }
    }
}


