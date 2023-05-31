package Exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> dicionario = new HashMap<>();

        List<String> bola = new ArrayList<>();
        List<String> boneca = new ArrayList<>();
        List<String> dado = new ArrayList<>();

        dicionario.put("bola", bola);
        bola.add("azul");

        dicionario.put("boneca", boneca);
        boneca.add("amarela");

        dicionario.put("dado", dado);
        dado.add("rosa");

        for (String chaves : dicionario.keySet()){
            List<String> valores = dicionario.get(chaves);
            System.out.println("A chave e: " + chaves + " e os valores: " + valores);
        }
    }
}
