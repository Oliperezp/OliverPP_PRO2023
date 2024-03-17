package es.ies.puerto.modelo.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.abstractas.FicherosAbstractas;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;

import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends FicherosAbstractas implements ICrudOperaciones {
    List<Personaje> personajes;
    String path="src/main/resources/personajes.json";
    @Override
    public List<Personaje> obtenerPersonajes() {
        existeFichero(path);
        try {
            String json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<Personaje>>(){}.getType();
            personajes =  new Gson().fromJson(json, listType);

        } catch (IOException exception) {
            throw new RuntimeException(exception.getMessage());
        }
        return personajes;
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
        if (personajes.contains(personaje)) {
            return;
        }
        personajes.add(personaje);
        guardarDatos(personajes);
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        existeFichero(path);
        if (!personajes.contains(personaje)) {
            return;
        }
        personajes.remove(personaje);
        guardarDatos(personajes);
    }

    @Override
    public void updatePersonaje(Personaje persona) {
        existeFichero(path);
        if (!personajes.contains(persona)) {
            return;
        }
        int posicion = personajes.indexOf(persona);
        personajes.set(posicion,persona);
        guardarDatos(personajes);
    }

    private  void guardarDatos(List<Personaje> personajes) {
        existeFichero(path);
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
