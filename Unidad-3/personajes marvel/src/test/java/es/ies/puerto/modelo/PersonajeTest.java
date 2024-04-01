package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PersonajeTest {

    private static final String PODERES = "poder1,poder2,poder3";
    private static final String GENERO = "genero";
    private static final String ALIAS = "alias";
    private static final String NOMBRE = "nombre";
    Personaje personaje;
    @BeforeEach
    public void beforeEach(){
        personaje = new Personaje(NOMBRE, ALIAS, GENERO, Arrays.asList(PODERES.split(personaje.DELIMITADOR)));
    }
    @Test
    public void personaNotNull(){
        Assertions.assertNotNull(personaje);
    }
    @Test
    public void personaToCsv(){
        String resultadoOk=NOMBRE+personaje.DELIMITADOR+ALIAS+personaje.DELIMITADOR+GENERO+personaje.DELIMITADOR+PODERES;
        Assertions.assertEquals(resultadoOk, personaje.toCsv());
    }
    @Test
    public void getSetTest(){
        List<String> poderesUpdate = Arrays.asList("Poder4,Poder5,Poder6");
        String generoUpdate = "generoUpdate";
        String aliasUpdate = "aliasUpdate";
        String nombreUpdate = "nombreUpdate";
        personaje.setPoderes(poderesUpdate);
        personaje.setGenero(generoUpdate);
        personaje.setAlias(aliasUpdate);

        Assertions.assertEquals(personaje.getPoderes(), poderesUpdate);
        Assertions.assertEquals(personaje.getGenero(), generoUpdate);
        Assertions.assertEquals(personaje.getAlias(), aliasUpdate);
        Assertions.assertEquals(personaje.getNombre(), nombreUpdate);
    }
    @Test
    public void hashCodeTest(){
        Assertions.assertEquals(Objects.hash(ALIAS), personaje.hashCode());
    }



}
