import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void comprobarOrdenacionTestOk(){

        int[] arrayOrdenar={3,2,4,5};

        int[] resultadoOk= {2,3,4,5};

        int[] resultado=ejercicio2.ordenarArray(arrayOrdenar);

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

    }




}
