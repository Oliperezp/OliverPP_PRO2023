package ies.puerto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1=new Ejercicio1();

    @Test
    public void inversoOkTest(){

        String palabra = "resultados";
        String resultadoOk = "sodatluser";
        String resultado = ejercicio1.invertirCadena(palabra);

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");




    }



}
