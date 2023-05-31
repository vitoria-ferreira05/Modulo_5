package Exercicio4;

public class ContaCorrente implements Tributos{
    public ContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    private double saldoContaCorrente;
    @Override
    public double calcularTributos() {
        return saldoContaCorrente * 0.01;
    }
}
