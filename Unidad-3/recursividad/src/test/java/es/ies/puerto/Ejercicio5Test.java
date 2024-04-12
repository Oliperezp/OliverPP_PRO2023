package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio;

    int base=2;
    int exponente=3;
    int resultado=8;
    int resultadoExponenteCero=1;
    @BeforeEach
    public void beforeEach() {
      ejercicio=new Ejercicio5();
    }

    @Test
    public void potenciaTest() {
      int resultadoEsperado=ejercicio.potenciaTradicional(base,exponente);
        Assertions.assertEquals(resultadoEsperado,resultado,"No es el resultado esperado");
    }

    @Test
    public void potenciaExponenteCero() {
        int resultadoEsperado=ejercicio.potenciaTradicional(base,0);
        Assertions.assertEquals(resultadoEsperado,resultadoExponenteCero,"No es el resultado esperado");
    }

    @Test
    public void potenciaExponenteRecursivoCero() {
        int resultadoEsperado=ejercicio.potenciaRecursiva(base,0);
        Assertions.assertEquals(resultadoEsperado,resultadoExponenteCero,"No es el resultado esperado");
    }

    @Test
    public void potenciaRecursivaTest() {
        int resultadoEsperado=ejercicio.potenciaRecursiva(base,exponente);
        Assertions.assertEquals(resultadoEsperado,resultado,"No es el resultado esperado");
    }
}
