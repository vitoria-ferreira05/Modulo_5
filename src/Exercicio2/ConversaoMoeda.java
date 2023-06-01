package Exercicio2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ConversaoMoeda {

    private static final BigDecimal cotacaoDolarAmericano = new BigDecimal("5.50");
    private static final BigDecimal cotacaoDolarCanadense = new BigDecimal("4.50");
    private static final BigDecimal cotacaoEuro = new BigDecimal("6.50");
    private static final BigDecimal cotacaoLibraEsterlina = new BigDecimal("7.50");

    private static final Map<String, BigDecimal> cotacaoMoedas = new HashMap<>();
    private static BigDecimal valor;
    private static String moeda;

    static {
        cotacaoMoedas.put("DÓLAR AMERICANO", cotacaoDolarAmericano);
        cotacaoMoedas.put("DÓLAR CANADENSE", cotacaoDolarCanadense);
        cotacaoMoedas.put("EURO", cotacaoEuro);
        cotacaoMoedas.put("LIBRA ESTERLINA", cotacaoLibraEsterlina);
    }

    public static BigDecimal converterMoeda() {
       
        BigDecimal cotacao = converterMoeda();
        int RoundingMode = 0;
        return valor.multiply(cotacao).setScale(2, RoundingMode);
    }
}

