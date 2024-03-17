package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class PersonajesTest {

    String nombre = "Superman";
    String alias = "Clark Kent";
    String genero = "Masculino";
    List<String>poderes;



    Personaje personaje;
    PersonajeList personajeList;

    @BeforeEach
    public void beforeEach() {
        personajeList =new PersonajeList();
        personaje = new Personaje(nombre,alias,genero,poderes);
    }

    @Test
    public void personajesToXml() {

        Persister serializer = new Persister();
        try {
            serializer.write(personaje, new File("src/main/resources/personajes.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void xmlToPersonajesTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/personajes.xml");
            PersonajeList personajes = serializer.read(PersonajeList.class, file);
            Assertions.assertNotNull(personajes,"Se ha obtenido un valor nulo");
            Assertions.assertTrue(!personajes.getPersonajes().isEmpty(),
                    "No se ha obtenido una lista vacia");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

}
