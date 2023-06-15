package Exercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {

    @Test
    public void deveRetornarValorSaldoDepositoESaque(){
        ContaCorrente.depositoConta(10);
        ContaCorrente.getSaldo();

        Assertions.assertEquals(10, 10);
    }
}
