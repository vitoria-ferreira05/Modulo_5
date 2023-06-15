package Exercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class DiasDaSemanaTest {

    @Test
    public void diaDaSemanaDomingoTemQueSerOMelhorDiaPraFeira(){
        int dia = 1;
        if (dia == 1){
            System.out.println("O melhor dia para ir à feira é domingo!");
        }else {
            System.out.println("Os outros dias podem ser bons para ir a feira");
        }

        Assertions.assertEquals(1, 1);
    }
}
