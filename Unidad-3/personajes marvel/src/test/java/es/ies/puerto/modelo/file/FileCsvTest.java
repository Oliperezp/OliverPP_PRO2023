package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.abstractas.FicherosAbstractas;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileCsvTest {

    private FileCsv csv;
    UtilidadesClass utilidades;
    List<Personaje> personas;
    List<Personaje> personasEscribir;
    Personaje personajeEscribir;
    @BeforeEach
    public void beforeEach(){
        csv = new FileCsv();
        personas = csv.leer();
        personasEscribir = new ArrayList<>();
        List<String> poderes = Arrays.asList("poder1,poder2,poder3".split(utilidades.DELIMITADOR));
        personajeEscribir = new Personaje(null, null, null, poderes);
        personasEscribir.add(personajeEscribir);
    }
    @AfterEach
    public void afterEach(){
        csv.actualizar(personas);
    }

    @Test
    public void CsvNotNullTest(){
        Assertions.assertNotNull(csv);
    }

    @Test
    public void CsvLeerEscribirTest(){
        csv.escribir(personasEscribir);
        Assertions.assertEquals(csv.leer().toString(), personasEscribir.toString());;
    }
    @Test
    public void CsvEliminarTest(){
        csv.eliminar(FicherosAbstractas.RUTA_CSV);
        Assertions.assertEquals(Arrays.asList(), csv.leer());
    }
    @Test
    public void CsvModificarTest(){
        csv.modificar(personasEscribir);
        Assertions.assertEquals(csv.leer().toString(), personasEscribir.toString());;
    }
}
