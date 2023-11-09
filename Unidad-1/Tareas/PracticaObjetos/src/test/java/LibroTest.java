import ies.puerto.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    String autor="Tolkien";
    String titulo="El señor de los anillos";
    int anioPulicacion=1954;


    Libro libro;

    @BeforeEach
     public void beforeEach(){
        libro = new Libro(titulo,autor,anioPulicacion);

    }


    @Test
    public void constructorTestOk(){

      Assertions.assertEquals(titulo,libro.getTitulo(),"No se ha obtenido el mensaje esperado");
      Assertions.assertEquals(autor,libro.getAutor(),"No se ha obtenido el mensaje esperado");
      Assertions.assertEquals(anioPulicacion,libro.getAnioPublicacion(),"No se ha obtenido el mensaje esperado");

    }

    @Test
    public void comprobarTextoLibro(){

        String resultado = libro.imprimirLibro();
        String resultadoOk="Titulo:"+"El señor de los anillos"+ "Autor:" + "Tolkien" + "anioPublicacion:" + "1954";

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
 public void comprobarConstructorPorDefectoTestOk(){

     libro=new Libro();
 }

 @Test
 public void setAutorTestOk(){

        String miAutor = "Federico";
        libro.setAutor(miAutor);

        Assertions.assertEquals(miAutor,libro.getAutor(),"No es el resultado esperado");

 }

}
