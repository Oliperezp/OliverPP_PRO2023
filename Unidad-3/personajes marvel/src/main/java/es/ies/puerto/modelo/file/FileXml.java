package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.PersonajeList;
import es.ies.puerto.modelo.abstractas.FicherosAbstractas;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.core.Persister;
import java.io.File;
import java.util.List;

public class FileXml extends FicherosAbstractas implements ICrudOperaciones {

    List<Personaje> personajes;
    String path="src/main/resources/personajes.xml";
    @Override
    public List<Personaje> obtenerPersonajes() {
        existeFichero(path);

        Persister serializer = new Persister();
        try {
            File file = new File(path);
            PersonajeList personajeList = serializer.read(PersonajeList.class, file);
            personajes = personajeList.getPersonajes();
            return personajes;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        existeFichero(path);
        int posicion =  personajes.indexOf(personaje);
        if (posicion > 0 ) {
            return personajes.get(posicion);
        }
        return null;
    }

    @Override
    public void addPersonaje(Personaje personaje) {
        existeFichero(path);
        personajes.add(personaje);
        PersonajeList personaList = new PersonajeList(personajes);
        Persister serializer = new Persister();
        try {
            serializer.write(personaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        existeFichero(path);
        personajes.remove(personaje);
        PersonajeList personaList = new PersonajeList(personajes);
        Persister serializer = new Persister();
        try {
            serializer.write(personaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePersonaje(Personaje personaje) {
        existeFichero(path);
        int posicion =  personajes.indexOf(personaje);
        if (posicion < 0 ) {
            return;
        }
        personajes.set(posicion,personaje);
        PersonajeList personajeList = new PersonajeList(personajes);
        Persister serializer = new Persister();
        try {
            serializer.write(personajeList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
