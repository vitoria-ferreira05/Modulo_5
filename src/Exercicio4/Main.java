package Exercicio4;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Tributos> tributosContas = new ArrayList<>();
        tributosContas.add(new ContaCorrente(1000.00));
        tributosContas.add(new ContaPoupanca(300.0));
        tributosContas.add(new SeguroDeVida());


        for (Tributos saldoComTributos : tributosContas) {
            double tributo = saldoComTributos.calcularTributos();
            double tributoTotal = 0;
            tributoTotal += tributo;

            System.out.printf("\n%.2f", tributoTotal);
        }
    }
}
