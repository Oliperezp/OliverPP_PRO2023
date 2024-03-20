package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.PersonajeList;
import es.ies.puerto.modelo.abstractas.FicherosAbstractas;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml extends FicherosAbstractas implements ICrudOperaciones {

    @Override
    public boolean actualizar(List<Personaje> personajes) {
        PersonajeList personajelista = new PersonajeList(personajes);
        try {
            Persister persister = new Persister();
            persister.write(personajelista, new File(RUTA_XML));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean escribir(List<Personaje> personajes) {
        return actualizar(personajes);
    }

    @Override
    public List<Personaje> leer() {
        List<Personaje> personajes = new ArrayList<>();
        if (existe(RUTA_XML)) {
            Persister persister = new Persister(new AnnotationStrategy());
            File file = new File(FicherosAbstractas.RUTA_XML);
            try {
                PersonajeList personajeContainer = persister.read(PersonajeList.class, file);
                personajes = personajeContainer.getPersonajes();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personajes;
    }

    @Override
    public boolean modificar(List<Personaje> personas) {
        return actualizar(personas);
    }
}
