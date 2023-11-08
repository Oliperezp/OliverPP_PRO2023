import ies.puerto.Circulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    Circulo circulo = new Circulo();

    @Test
    public void comprobarRadioOkTest(){

        double resultado=circulo.calcularAreaCirculo(5);
        double resultadoOk=78.53981633974483;
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void comprobarCircunferenciaOkTest(){

        double resultado=circulo.calcularCircunferencia(5);
        double resultadoOk=31.415926535897932;
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }



}
