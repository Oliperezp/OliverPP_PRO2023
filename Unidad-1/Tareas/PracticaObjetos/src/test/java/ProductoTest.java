import ies.puerto.Tienda.Producto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    Producto producto = new Producto("Frambuesa",2.50,20);

    @Test
    public void comprobarAgregarStock(){
        int resultado = producto.agregarStock(4);
        int resultadoOk=24;

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");


    }

    @Test
    public void comprobarquitarStock(){
        int resultado = producto.retirarStock(4);
        int resultadoOk=16;

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");


    }

}
