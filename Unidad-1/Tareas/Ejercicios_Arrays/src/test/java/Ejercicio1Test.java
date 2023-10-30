import ies.puerto.Ejercicio1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
   public void sumarNumerosTestOk(){
        int resultado = ejercicio1.sumarNumeros();
        int resultadoOk=15;

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

          }






}
