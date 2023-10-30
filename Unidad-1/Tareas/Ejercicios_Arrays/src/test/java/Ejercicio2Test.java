import ies.puerto.Ejercicio2;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void calcularSumaTest(){

        double resultado=ejercicio2.calcularSuma();
        double resultadoOk=17.5;

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

        }

        @Test
        public void calcularPromedioTest(){

        double resultado = ejercicio2.calcularPromedio();
        double resultadoOk=3.5;

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

        }


}
