package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public boolean chequearNumeroTest(int numero){

        boolean resultadoOk=true;
        boolean resultado = ejercicio2.chequearNumero(6);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");


        return resultado;
    }



}
