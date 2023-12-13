package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();


    @Test
    public void numeroBinarioOkTest(){

        int numero = 25;
        String resultadoOk = "11001";

        String resultado = ejercicio4.convertirBinario(numero);

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");





    }



}
