package Exercicio1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Definir e inicializar uma nova lista vazia. Adicionar os seguintes
        //elementos à lista vazia: [1,5,5,6,7,8,8,8]. Imprimir o resultado na tela.

        List<Integer> lista = new LinkedList<>();

        boolean listaVazia = lista.isEmpty();
        System.out.println("A lista esta vazia? " + listaVazia);

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        System.out.println("Lista com elementos adicionados: " + lista);

    }
}
