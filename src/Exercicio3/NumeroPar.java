package Exercicio3;

public class NumeroPar {
    private static int numero;

    public NumeroPar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public static void verificarNumeroPar(){
        if (numero % 2 == 0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é impar");
        }
    }

}
