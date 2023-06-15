package Exercicio2;

import java.util.Scanner;
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Digite o dia da semana: \n" +
                    "1 - Domingo\n" +
                    "2 - Segunda-feira\n" +
                    "3 - Terça-Feira\n" +
                    "4 - Quarta-Feira\n" +
                    "5 - Quinta-Feira\n" +
                    "6 - Sexta-Feira\n" +
                    "7 - Sábado\n" +
                    "8 - Sair");
            
            int dia = sc.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("O melhor dia para ir à feira é domingo!");
                    break;
                case 2:
                    System.out.println("Segunda-feira pode ser um bom dia para ir à feira.");
                    break;
                case 3:
                    System.out.println("Terça-feira pode ser um bom dia para ir à feira.");
                    break;
                case 4:
                    System.out.println("Quarta-feira pode ser um bom dia para ir à feira.");
                    break;
                case 5:
                    System.out.println("Quinta-feira pode ser um bom dia para ir à feira.");
                    break;
                case 6:
                    System.out.println("Sexta-feira pode ser um bom dia para ir à feira.");
                    break;
                case 7:
                    System.out.println("Sábado pode ser um bom dia para ir à feira.");
                    break;
                case 8:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
    public static void verificarMelhorDiaFeira(){
        int dia = 0;
        if (dia == 1){
            System.out.println("O melhor dia para ir à feira é domingo!");
        }else {
            System.out.println("Os outros dias podem ser bons para ir a feira");
        }
    }
}


