package Exercicio4;

public class ContaPoupanca implements Tributos {
private double saldoContaPoupanca;

    public ContaPoupanca(double saldoContaPoupanca) {
        this.saldoContaPoupanca = saldoContaPoupanca;
    }

    @Override
    public double calcularTributos() {
       return saldoContaPoupanca * 0;
    }
}
