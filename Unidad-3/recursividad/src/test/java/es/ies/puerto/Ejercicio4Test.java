package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4Test {
    Ejercicio4 ejercicio;

    @BeforeEach
    public void beforeEach() {
     ejercicio=new Ejercicio4();
    }

    @Test
    public void ejercicio1Test() {

        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(0,2,4,6,8,10));
        List<Integer> resultado;
        resultado=ejercicio.numerosPares(10);

        Assertions.assertEquals(resultadoEsperado,resultado,"No es el resultado esperado");

    }

    @Test
    public void paresRecursivosTest() {

        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10,8,6,4,2,0));
        List<Integer> resultado;
        resultado=ejercicio.numerosParesRecursivo(10);

        Assertions.assertEquals(resultadoEsperado,resultado,"No es el resultado esperado");

    }


}
