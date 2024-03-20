package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileXmlTest {

    private static final String NOMBRE = "Nombre";
    private static final String ALIAS = "Alias";
    private static final String GENERO = "Genero";

    FileXml xml;
    List<Personaje> personajes;
    Personaje personajeEscribir;
    List<Personaje> personajesEscribir;

    @BeforeEach
    public void beforeEach() {
        xml = new FileXml();
        personajes = xml.leer();
        List<String> poderes = new ArrayList<>();
        poderes.add("poder1");
        poderes.add("poder2");
        poderes.add("poder3");
        personajeEscribir = new Personaje(NOMBRE, ALIAS, GENERO, poderes);
        personajesEscribir = new ArrayList<>();
        personajesEscribir.add(personajeEscribir);
        xml.escribir(personajesEscribir);
    }

    @AfterEach
    public void afterEach() {
        xml.escribir(personajes);
    }

    @Test
    public void XmlNotNullTest() {
        Assertions.assertNotNull(xml);
    }

    @Test
    public void XmlLeerEscribirTest() {
        Assertions.assertEquals(personajesEscribir, xml.leer());
    }

    @Test
    public void XmlModificarTest() {
        xml.modificar(personajes);
        Assertions.assertEquals(personajes, xml.leer());
    }
}
