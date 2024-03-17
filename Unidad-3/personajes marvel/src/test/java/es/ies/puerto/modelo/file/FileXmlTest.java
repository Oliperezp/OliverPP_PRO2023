package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileXmlTest {

    String nombreInsertar = "Cat-Woman";
    String aliasInsertar = "Selina-Kyle";
    String generoInsertar = "Femenino";
   List<String> poderes;


    ICrudOperaciones persistencia;
    List<Personaje> personajes;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileXml();
        personajes = persistencia.obtenerPersonajes();
    }

    @Test
    public void obtenerPersonajesTest() {
        Assertions.assertFalse(personajes.isEmpty(),
                "No se ha obtenido el valor esperado");
    }


    @Test
    public void obtenerPersonajeTest() {
        Personaje personajeBuscar = new Personaje("Spider-Man");
        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.getNombre(),"Spider-Man",
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personajeBuscar.getNombre(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personajeBuscar.getGenero(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personajeBuscar.getAlias(),
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addDeletePersonajeTest() {

        int numPersonasInicial = personajes.size();
        Personaje personajeInsertar = new Personaje(nombreInsertar,
                aliasInsertar,generoInsertar,poderes);
        persistencia.addPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonajesInsertar = personajes.size();
        Assertions.assertTrue(personajes.contains(personajeInsertar),
                "No se ha encontrado al personaje");
        Assertions.assertEquals(numPersonasInicial +1 ,numPersonajesInsertar,
                "No se ha obtenido el numero esperado");
        persistencia.deletePersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonasBorrado = personajes.size();
        Assertions.assertEquals(numPersonasInicial ,
                numPersonasBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersonaje() {
        String nombreActualizar = "Iron-Man";
        Personaje personajeBuscar = new Personaje(nombreActualizar);
        Personaje personajeActualizar = persistencia.obtenerPersonaje(personajeBuscar);
        Personaje personaBackup = persistencia.obtenerPersonaje(personajeBuscar);
        personajeActualizar.setAlias(aliasInsertar);
        personajeActualizar.setGenero(generoInsertar);
        personajeActualizar.setPoderes(poderes);
        persistencia.updatePersonaje(personajeActualizar);

        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.toString(), personajeActualizar.toString(),
                "Los datos actualizados no son los esperados");
        persistencia.updatePersonaje(personaBackup);



    }
}
