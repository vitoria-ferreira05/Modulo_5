package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoMaisBarato {
    static double preco1 = 1.00;
    static double preco2 = 2.00;
    static double preco3 = 3.00;
    public static void main(String[] args) {

        verificarPrecoMaisBarato();

    }
    public static void verificarPrecoMaisBarato(){
        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("O primeiro produto e mais barato");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("O segundo produto e mais barato");
        } else {
            System.out.println("O terceiro produto e mais barato");
        }
    }
}



