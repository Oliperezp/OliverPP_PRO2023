package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileJsonTest {

    String nombreInsertar = "otro";
    int edadInsertar = 99;
    String emailInsertar = "otro@email";

    ICrudOperaciones fileJson;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach() {
        fileJson = new FileJson();
        personas = fileJson.obtenerPersonas();
    }

    @Test
    public void obtenerPersonasTest() {
        Assertions.assertFalse(personas.isEmpty(),
                "No se ha obtenido el valor esperado");
    }


    @Test
    public void obtenerPersonaTest() {
        Persona personaBuscar = new Persona(2);
        personaBuscar = fileJson.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.getId(),2,
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getNombre(),
                "No se ha obtenido el valor esperado");
        Assertions.assertTrue (personaBuscar.getEdad() > 0,
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getEmail(),
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addDeletePersonaTest() {

        int numPersonasInicial = personas.size();
        Persona personaInsertar = new Persona(5, nombreInsertar,
                edadInsertar,emailInsertar);
        fileJson.addPersona(personaInsertar);
        personas = fileJson.obtenerPersonas();
        int numPersonasInsertar = personas.size();
        Assertions.assertTrue(personas.contains(personaInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonasInicial +1 ,
                numPersonasInsertar,
                "No se ha obtenido el numero esperado");
        fileJson.deletePersona(personaInsertar);
        personas = fileJson.obtenerPersonas();
        int numPersonasBorrado = personas.size();
        Assertions.assertEquals(numPersonasInicial ,
                numPersonasBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersona() {
        int idActualizar = 2;
        Persona personaBuscar = new Persona(idActualizar);
        Persona personaActualizar = fileJson.obtenerPersona(personaBuscar);
        Persona personaBackup = fileJson.obtenerPersona(personaBuscar);
        personaActualizar.setNombre(nombreInsertar);
        personaActualizar.setEdad(edadInsertar);
        personaActualizar.setEmail(emailInsertar);
        fileJson.updatePersona(personaActualizar);

        personaBuscar = fileJson.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.toString(), personaActualizar.toString(),
                "Los datos actualizados no son los esperados");
        fileJson.updatePersona(personaBackup);



    }
}
