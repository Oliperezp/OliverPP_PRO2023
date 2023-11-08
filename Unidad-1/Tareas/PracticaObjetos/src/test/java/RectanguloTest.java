import ies.puerto.Circulo;
import ies.puerto.Rectangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest {

    Rectangulo rectangulo = new Rectangulo();

    @Test
    public void comprobarRadioOkTest(){

        double resultado=rectangulo.calcularAreaRectangulo(5,6);
        float resultadoOk=30;
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void comprobarPerimetroOkTest(){

        double resultado=rectangulo.calcularPerimetroRectangulo(5,6);
        float resultadoOk=22;
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }




}
