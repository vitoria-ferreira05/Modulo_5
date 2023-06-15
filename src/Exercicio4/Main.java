package Exercicio4;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1234567, "Vitoria Caroline", 700.00);
        System.out.println("Numero da conta: " + contaCorrente.getNumeroConta() + "\n" +
                "Nome do correntista: " + contaCorrente.getNomeCorrentista() + "\n" +
                "Saldo atual da conta: R$" + contaCorrente.getSaldo() );
        while (true){

            System.out.println("1. Deposito\n" +
                    "2. Saque\n" +
                    "3. Sair");
            int opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do deposito: ");
                    double valorDeposito = sc.nextDouble();
                    contaCorrente.depositoConta(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    contaCorrente.saqueConta(valorSaque);
                    break;
                case 3:
                    System.out.println("Programa encerrado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
