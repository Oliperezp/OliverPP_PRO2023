package es.ies.puerto.negocio;

import es.ies.puerto.modelo.Alimento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {

    Tienda tienda;
    String id ="idAlimento";
    String nombre= "nombreAlimento";
    String nombreActualizado = "valorNombreActualizado";
    float precioActualizado = 3f;
    String fEntradadaActualizada = "03/03/2024";
    String fCaducidadActualizada = "24/06/2024";
    float precio = 2f;
    String fEntrada = "01/03/2024";
    String fCaducidad= "23/06/2024";
    Alimento alimento;

    @BeforeEach
    public void beforeEach(){
        tienda = new Tienda();
        alimento=new Alimento(id,nombre,precio,fEntrada,fCaducidad);
        tienda.crearProducto(alimento);
    }

    @Test
    public void tiendaNotNullTest(){
       Assertions.assertNotNull(tienda,"No puede ser null");
    }

    @Test
    public void addAlimentoTiendoTest(){
       Assertions.assertEquals(1,tienda.obtenerProductos().size(),"No se ha obtenido el tamanio esperado");

    }

    @Test
    public void addAlimentoExisteTiendaTest(){
        tienda.crearProducto(alimento);
        Assertions.assertEquals(1,tienda.obtenerProductos().size(),"No se ha obtenido el tamanio esperado");

    }

@Test
    public void eliminarAlimentoTiendaTest(){
        tienda.eliminarProducto(alimento);
        Assertions.assertEquals(0,tienda.obtenerProductos().size(),"no se ha obtenido el tamanio esperado");
}

    @Test
    public void obtenerAlimentoTiendaTest(){
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(nombre,alimentoBuscar.getNombre(),"El valor no es el esperado");
        Assertions.assertEquals(precio,alimentoBuscar.getPrecio(),"El valor no es el esperado");
        Assertions.assertEquals(fEntrada,alimentoBuscar.getfEntrada(),"El valor no es el esperado");
        Assertions.assertEquals(fCaducidad,alimentoBuscar.getfCaducidad(),"El valor no es el esperado");

    }


    @Test
    public void obtenerAlimentoNoExisteTiendaTest(){
        Alimento alimentoBuscar = new Alimento("id2");
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertNull(alimentoBuscar,"No se ha obtenido el valor esperado");

    }

    @Test
    public void actualizarAlimentoTiendaTest(){
        Alimento alimentoActualizar = new Alimento(id,nombreActualizado,precioActualizado,fEntradadaActualizada,fCaducidadActualizada);
        tienda.actualizarProducto(alimentoActualizar);

        Alimento alimentoBuscar = new Alimento(id);

        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(nombreActualizado,alimentoBuscar.getNombre(),"El valor no es el esperado");
        Assertions.assertEquals(precioActualizado,alimentoBuscar.getPrecio(),"El valor no es el esperado");
        Assertions.assertEquals(fEntradadaActualizada,alimentoBuscar.getfEntrada(),"El valor no es el esperado");
        Assertions.assertEquals(fCaducidadActualizada,alimentoBuscar.getfCaducidad(),"El valor no es el esperado");

    }


}
