package Exercicio2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //2. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes
        //elementos ao conjunto vazio: {1,5,5,6,7,8,8,8}. Imprimir o resultado na
        //tela. Qual é a diferença entre este exercício e o anterior?

        Set<Integer> conjunto = new HashSet<>();

        boolean conjuntoVazio = conjunto.isEmpty();
        System.out.println("O conjunto esta vazio? " + conjuntoVazio);

        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

        System.out.println("Conjunto com elementos adicionados: " + conjunto);

        //A diferença do exercicio 1 entre o e exercicio 2 é que no exercicio 1 pede uma lista, no qual utilizei
        //List(LinkedList) e no exercicio 2 utilizei Set(HashSet)
    }
}
