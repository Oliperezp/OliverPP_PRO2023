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

        calculoHorasErroneo(20);

    }
    public int calculoHoras(int numeroHoras) {

        int resultado = ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertEquals(100, resultado, "No es el resultado correcto");

        return resultado;
    }

    @Test
    public int calculoHorasErroneo(int numeroHoras){

        int resultado=ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertNotEquals(100,resultado,"No es el resultado correcto");

        return resultado;
    }

}
