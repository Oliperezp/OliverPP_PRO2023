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
    public void calcularAreaTrianguloTest() {
        int numero1 = 2;
        int numero2 = 3;
        int resultado = ejercicio4.numeroMayor(numero1,numero2);
        Assertions.assertEquals(resultado, 3, "No se ha obtenido el resultado esperado");
    }



}