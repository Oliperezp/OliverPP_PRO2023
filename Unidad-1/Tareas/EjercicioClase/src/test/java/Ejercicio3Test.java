
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void comprobarNotaOkSuspenso(){

     String resultadoOk="Bien";
     String resultado=ejercicio3.calificacionesEstudiantes(6.5);

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

    }

    @Test
    public void comprobarNotaOkSobresaliente(){

        String resultadoOk="Suspenso";
        String resultado=ejercicio3.calificacionesEstudiante(3);

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");

    }


}
