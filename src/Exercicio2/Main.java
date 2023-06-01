package Exercicio2;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Boas vindas ao conversor de moedas");

        while (continuar) {
            System.out.println("Digite a moeda que você quer converter:");
            System.out.println("Opções de moeda: Dólar americano, Dólar canadense, Euro, Libra Esterlina");

            String moeda = sc.nextLine().toUpperCase();

            if (!moeda.equals("DÓLAR AMERICANO") && !moeda.equals("DÓLAR CANADENSE") && !moeda.equals("EURO") && !moeda.equals("LIBRA ESTERLINA")) {
                throw new IllegalArgumentException("Tipo de moeda inválido");
            }

            System.out.println("O programa só converte para Real (R$)");

            System.out.println("Digite o valor a ser convertido:");
            String valorString = sc.nextLine();

            if (valorString.isEmpty()) {
                throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal");
            }

            BigDecimal valor;
            try {
                valor = new BigDecimal(valorString);
                if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("Valor inválido, por favor, tente novamente");
                    continue;
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal");
            }

            BigDecimal valorConvertido = ConversaoMoeda.converterMoeda();

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dataAtual = dateFormat.format(new Date());

            System.out.println("A " + moeda + " na cotação de hoje " + dataAtual + " está em " + ConversaoMoeda.converterMoeda() +  ", o valor");
        }
    }
}
