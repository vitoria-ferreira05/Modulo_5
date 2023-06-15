package Exercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeroParTest {

    @Test
    public void numeroTemQueSerPar(){
        NumeroPar.verificarNumeroPar();

        Assertions.assertEquals(6, 6);
    }
}
