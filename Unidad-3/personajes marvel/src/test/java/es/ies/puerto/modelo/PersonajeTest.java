package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class PersonajeTest {

    String nombre = "Cat-Woman";
    String alias = "Selina-Kyle";
    String genero = "Femenino";
    List<String> poderes ;

    Personaje personaje;

    @BeforeEach
    public void beforeEach() {

        poderes.add("Arañazos");
        poderes.add("Agilidad");
        personaje = new Personaje(nombre, alias, genero,poderes);
    }

    @Test
    public void createPersonaTest() {

        Assertions.assertNotNull(personaje, "El objeto no puede ser nulo");
    }

    @Test
    public void toStringPersonajeTest() {
        Assertions.assertTrue(personaje.toString().contains(String.valueOf(nombre)),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(alias),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(String.valueOf(genero)),
                "El resultado no es el esperado");

    }


    @Test
    public void toCsvPersonaTest() {
        Assertions.assertTrue(personaje.toCsv().contains(String.valueOf(nombre)),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(alias),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(String.valueOf(genero)),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(personaje.DELIMITADOR),
                "El resultado no es el esperado");
    }

    @Test
    public void equalsPersonajeTest() {
        Personaje personaBuscar = new Personaje(nombre);
        Assertions.assertEquals(personaBuscar, personaje,
                "las personas deben de ser iguales");
    }

    @Test
    public void personajeToXml() {
        Persister serializer = new Persister();
        try {
            serializer.write(personaje, new File("src/main/resources/personajes.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void xmlToPersonajeTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/personajes.xml");
            Personaje persona = serializer.read(Personaje.class, file);
            Assertions.assertEquals(nombre, personaje.getNombre(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(alias, personaje.getAlias(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(genero, persona.getGenero(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(poderes, persona.getPoderes(),
                    "No se ha obtenido el valor esperado");

        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }



}
