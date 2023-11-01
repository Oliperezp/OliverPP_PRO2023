import ies.puerto.Ejercicio5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void comprobarNumeroOk(){

        int resultado = ejercicio5.buscarElemento();
        int resultadoOk = 3;

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado correcto");


    }

}
