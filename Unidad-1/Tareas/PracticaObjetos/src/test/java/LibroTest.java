import ies.puerto.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibroTest {

    Libro libro = new Libro("El señor de los anillos","Tolkien",1954);

    @Test
    public void comprobarTextoLibro(){

        String resultado = libro.imprimirLibro();
        String resultadoOk="Titulo:" + "El señor de los anillos" + "Autor:" + "Tolkien" + "anioPublicacion:" + "1954";

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");


    }



}
