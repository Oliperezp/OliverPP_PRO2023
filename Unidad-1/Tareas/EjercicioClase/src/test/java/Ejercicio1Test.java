import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void comprobarPosicionArrayTestOk(){

       int resultadoOk=5;
       int resultado = ejercicio1.buscarElemento();

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

    }

}
