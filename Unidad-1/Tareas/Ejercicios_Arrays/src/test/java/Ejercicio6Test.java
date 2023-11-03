import ies.puerto.Ejercicio6;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void comprobarTraspuesta(){

        int[][] matrizOriginal={{1,2,3},{4,5,6},{7,8,9}};
        int[][] resultado = ejercicio6.matrizOriginal(matrizOriginal);
        int[][] resultadoOk = {{1,4,7},{2,5,8},{3,6,9}};

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");


    }


}
