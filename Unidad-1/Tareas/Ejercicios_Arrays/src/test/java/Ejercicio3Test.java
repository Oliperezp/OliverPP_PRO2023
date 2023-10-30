import ies.puerto.Ejercicio3;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio3Test {

    Ejercicio3 ejericicio3 = new Ejercicio3();

    @Test
    public void calcularNumeroMayorTest(){

        int resultado= ejericicio3.numeroMayor();
        int resultadoOk = 9;

        Assertions.assertEquals(resultadoOk,resultado,"No es el valor esperado");
    }

    @Test
    public void calcularNumeroMenorTest(){

        int resultado= ejericicio3.numeroMenor();
        int resultadoOk = 1;

        Assertions.assertEquals(resultadoOk,resultado,"No es el valor esperado");
    }



}
