package Exercicio1;

public class NomeAlimento {
    private String nomeDoAlimento;
    private double qtdade;

    public NomeAlimento(String nomeDoAlimento, double qtdade) {
        this.nomeDoAlimento = nomeDoAlimento;
        this.qtdade = qtdade;
    }

    public String getNomeDoAlimento() {
        return nomeDoAlimento;
    }

    public double getQtdade() {
        return qtdade;
    }
}

