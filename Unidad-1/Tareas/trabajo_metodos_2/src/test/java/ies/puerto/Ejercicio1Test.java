package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();


        @Test

        public void calcularSueldoHoras10Test(){

        calculoHoras(10);

    }

    @Test

    public void calcularSueldoHoras20Test(){

        calculoHoras(20.5f);

    }
    public double calculoHoras(float numeroHoras) {

        double resultado = ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertEquals(205, resultado, "No es el resultado correcto");

        return resultado;
    }

    @Test
    public double calculoHorasErroneo(float numeroHoras){

        double resultado=ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertNotEquals(100,resultado,"No es el resultado correcto");

        return resultado;
    }

}
