package Exercicio4;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Tributos> tributosContas = new ArrayList<>();
        tributosContas.add(new ContaCorrente());
        tributosContas.add(new ContaPoupanca());
        tributosContas.add(new SeguroDeVida());

        for (Tributos saldoComTributos : tributosContas){
            double tributo = saldoComTributos.calcularTributos();
            System.out.println(tributo);
        }

    }
}
