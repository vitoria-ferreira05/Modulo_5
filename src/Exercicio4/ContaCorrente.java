package Exercicio4;

public class ContaCorrente implements Tributos{
    private double saldoContaCorrente = 900;
    @Override
    public double calcularTributos() {
        return saldoContaCorrente * 0.01;
    }
}
