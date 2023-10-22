package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6;


    @BeforeEach
    public void before() {

        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void calcularCuadradoTest() {
        int resultadoOk = 20;
        int resultado = ejercicio6.conversorCentigrados(68);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }


}