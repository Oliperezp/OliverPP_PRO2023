package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4;
    @BeforeEach
    public void before() {
        ejercicio4 = new Ejercicio4();
    }

    @Test
    public void calcularNumeroMayorTest() {
        int numero1 = 2;
        int numero2 = 3;
        int resultado = ejercicio4.numeroMayor(numero1,numero2);
        Assertions.assertEquals(resultado, 3, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void calcularNumeroMayorDeTresTest() {
        int numero1 = 2;
        int numero2 = 3;
        int numero3 = 4;
        int resultadoOk=4;
      int resultado = ejercicio4.numeroMayor(4);
        Assertions.assertEquals(resultado, resultadoOk, "No se ha obtenido el resultado esperado");
    }

}