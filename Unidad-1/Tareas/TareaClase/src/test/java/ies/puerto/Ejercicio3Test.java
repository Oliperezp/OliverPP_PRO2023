package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();


    @Test
    public void contarDigitosOkTest(){

       int numero = 3456;
        int resultadoOk = 18;

        int resultado = ejercicio3.sumarDigitos(numero);

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");





    }


}
