package Exercicio4;

public class ContaPoupanca implements Tributos {
private double saldoContaPoupanca = 600;


    @Override
    public double calcularTributos() {
       return saldoContaPoupanca * 0;
    }
}
