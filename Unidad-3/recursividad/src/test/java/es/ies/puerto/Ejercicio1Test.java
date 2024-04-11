package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio;
    public static final String MENSAJE = "No se ha obtenido el valor esperado";

    int resultado=24;

    @BeforeEach
    public void beforeEach() {

        ejercicio=new Ejercicio1();
    }

    @Test
    public void ejercicio1Test() {

        Assertions.assertEquals(resultado,ejercicio.factorialTradicional(4),MENSAJE);

    }

    @Test
    public void ejercicio1TradicionalTest() {

        Assertions.assertEquals(resultado,ejercicio.factorial(4),MENSAJE);
    }

}
