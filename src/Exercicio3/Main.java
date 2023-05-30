package Exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> dicionario = new HashMap<>();

        List<String> bola = new ArrayList<>();
        dicionario.put("bola", bola);
        bola.add("azul");

        List<String> boneca = new ArrayList<>();
        dicionario.put("boneca", boneca);
        boneca.add("amarela");

        List<String> dado = new ArrayList<>();
        dicionario.put("dado", dado);
        dado.add("rosa");


        for (String chave : dicionario.keySet()){
            List<String> valores = dicionario.get(chave);
            System.out.println("A chave e: " + chave + " e os valores: " + valores);
        }
    }
}
