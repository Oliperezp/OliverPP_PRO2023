import ies.puerto.ArraysUnidos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testeoArray {

    ArraysUnidos array = new ArraysUnidos();


    @Test
    public void comprobarArray(){



        int[] resultado = array.arraysUnidosOrdenados();
        int[] resultadoOk = {1,2,3,4,5,7,8};

        Assertions.assertEquals(resultadoOk,resultado,"no es lo que esperabamos");

    }



}
