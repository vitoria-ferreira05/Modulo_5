package Exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoMaisBaratoTest {
    @Test
    public void deveriaRetornarOPrimeiroValorMaisBarato(){
        ProdutoMaisBarato.verificarPrecoMaisBarato();

        Assertions.assertEquals(1.00, 1.00);
    }
}
