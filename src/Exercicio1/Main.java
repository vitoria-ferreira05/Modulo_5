package Exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaDeCompras listaCompras = new ListaDeCompras();
        boolean continuarLista = true;

        while (continuarLista) {
            System.out.println("---LISTA DE COMPRAS---" +
                    "\n 1. Adicionar alimento na lista" +
                    "\n 2. Mostrar a lista de compras" +
                    "\n 3. Sair da lista");

            System.out.println("Escolha uma opcao:");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    try {
                        listaCompras.adicionarAlimento();
                    } catch (Exception erro) {
                        System.out.println("Erro: " + erro.getMessage());
                    }
                    break;
                case 2:
                    listaCompras.mostrarListaCompras();
                    break;
                case 3:
                    continuarLista = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
    }
}



