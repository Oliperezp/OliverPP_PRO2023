import es.ies.puerto.enumerado.EnumColorArcoiris;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorArcoirisTest {

    EnumColorArcoiris colorArcoiris;

    @BeforeEach
    public void beforeEach(){

    }

    @Test
    public void colorArcoirisRojoTest(){

        colorArcoiris= EnumColorArcoiris.ROJO;
        System.out.println(colorArcoiris);
        Assertions.assertEquals(EnumColorArcoiris.ROJO,colorArcoiris,"No es el color esperado");
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris));

    }

    @Test
    public void colorArcoirisAmarilloTest(){

        colorArcoiris= EnumColorArcoiris.AMARILLO;
        System.out.println(colorArcoiris);
        Assertions.assertEquals(EnumColorArcoiris.AMARILLO,colorArcoiris,"No es el color esperado");
        Assertions.assertTrue(EnumColorArcoiris.AMARILLO.equals(colorArcoiris));

    }

    @Test
    public void colorArcoirisMiColorTest(){
        colorArcoiris= EnumColorArcoiris.valueOf("ROJO");
        Assertions.assertEquals(EnumColorArcoiris.ROJO,colorArcoiris,"No es el color esperado");
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris));
        System.out.println(colorArcoiris);
    }


}
