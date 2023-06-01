package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    Scanner sc = new Scanner(System.in);
    private List<NomeAlimento> verdura = new ArrayList<>();
    private List<NomeAlimento> legume = new ArrayList<>();
    private List<NomeAlimento> grao = new ArrayList<>();
    private List<NomeAlimento> outros = new ArrayList<>();


    public void adicionarAlimento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de alimento: " +
                "\n  - VERDURA" +
                "\n  - LEGUME" +
                "\n  - GRAOS" +
                "\n  - OUTROS");
        String tipo = scanner.nextLine().toUpperCase();

        if (!tipo.equals("VERDURA") && !tipo.equals("LEGUME") && !tipo.equals("GRAOS") && !tipo.equals("OUTROS")) {
            throw new IllegalArgumentException("Tipo de alimento inválido");
        }

        System.out.println("Digite a quantidade:");
        String qtdade = sc.nextLine();

        if (qtdade.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        }

        double quantidade;
        try {
            quantidade = Double.parseDouble(qtdade);
        } catch (NumberFormatException erro) {
            throw new NumberFormatException("A quantidade deve ser um número válido");
        }

        if (tipo.equals("VERDURA") || tipo.equals("GRAOS")) {
            if (quantidade % 1 == 0) {
                throw new NumberFormatException("Para verdura ou grãos, a quantidade deve ser informada com ponto");
            }
        } else {
            if (quantidade % 1 != 0) {
                throw new NumberFormatException("Para legume ou outros, a quantidade deve ser informada em unidades inteiras");
            }
        }

        System.out.println("Digite o nome do alimento:");
        String nome = sc.nextLine();

        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }

        NomeAlimento nomeAlimento = new NomeAlimento(nome, quantidade);

        if (tipo.equals("VERDURA")) {
            verdura.add(nomeAlimento);
        } else if (tipo.equals("LEGUME")) {
            legume.add(nomeAlimento);
        } else if (tipo.equals("GRAOS")) {
            grao.add(nomeAlimento);
        } else {
            outros.add(nomeAlimento);
        }
    }

    public void mostrarListaCompras() {
        System.out.println("Lista de compras:");
        System.out.println("Verduras:");
        for (NomeAlimento nomeAlimento : verdura) {
            System.out.println(nomeAlimento.getNomeDoAlimento() + " - " + nomeAlimento.getQtdade() + "gramas");
        }
        System.out.println("Legumes:");
        for (NomeAlimento nomeAlimento : legume) {
            System.out.println(nomeAlimento.getNomeDoAlimento() + " - " + nomeAlimento.getQtdade() + " unidades");
        }
        System.out.println("Graos:");
        for (NomeAlimento nomeAlimento : grao) {
            System.out.println(nomeAlimento.getNomeDoAlimento() + " - " + nomeAlimento.getQtdade() + "gramas");
        }
    }
}









