package Exercicio4;

public class ContaPoupanca implements Tributos {
private double saldoContaPoupanca;


    public double getSaldoContaPoupanca() {
        return saldoContaPoupanca = 500;
    }

    @Override
    public double calcularTributos() {
        double saldo = getSaldoContaPoupanca() * 0;
        System.out.printf("%.2f", saldo);
        return saldo;
    }
}
