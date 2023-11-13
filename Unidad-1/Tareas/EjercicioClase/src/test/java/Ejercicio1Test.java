
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void comprobarPosicionArrayTestOk(){

       int resultadoOk=5;
       int resultado = ejercicio1.buscarElemento();

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

    }

}
