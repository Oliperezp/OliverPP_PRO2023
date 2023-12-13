package ies.puerto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();


    @Test
        public void contarVocalesOkTest(){

        String texto = "LAs voces que no se oyeron";
        int resultadoOk = 10;

        int resultado = ejercicio2.contarVocales(texto);

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");





    }





}
