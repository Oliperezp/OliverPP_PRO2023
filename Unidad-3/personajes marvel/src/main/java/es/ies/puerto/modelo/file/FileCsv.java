package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileCsv extends UtilidadesClass implements ICrudOperaciones {

    @Element(name = "personajes")
    List<Personaje> personajes;
    List<String>poderes;

    String path="src/main/resources/personajes.csv";

    public List<Personaje> obtenerPersonajes() {
        existeFichero(path);
        List<Personaje> personajes1 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(DELIMITADOR);
                String nombre = datos[0];
                String alias = datos[1];
                String genero = datos[2];
                String poderes = datos[3];
                Personaje personaje = new Personaje(nombre,alias,genero,new ArrayList<>());
                personajes1.add(personaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personajes1;

    }

    public Personaje obtenerPersonaje(Personaje personaje) {
        existeFichero(path);
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                String[] datos = linea.split(DELIMITADOR);
                String nombre = datos[0];
                if (nombre.equals(personaje.getNombre())) {
                    String alias = datos[1];
                    String genero = datos[2];
                    String poderes = datos[3];
                    personaje.setAlias(alias);
                    personaje.setGenero(genero);
                    personaje.setPoderes(new ArrayList<>());
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personaje;
    }

    public void addPersonaje(Personaje personaje) {
        existeFichero(path);
        Personaje personajeBuscar = new Personaje(personaje.getNombre());
        personajeBuscar = obtenerPersonaje(personajeBuscar);
        if (personajeBuscar.getGenero() == null) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(personaje.toCsv()+ "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deletePersonaje(Personaje personaje) {
        existeFichero(path);
        Personaje personaBuscar = new Personaje(personaje.getNombre());
        List<Personaje> personajes = obtenerPersonajes();
        personajes.remove(personaje);
        try (FileWriter writer = new FileWriter(path)) {
            for (Personaje personajeFile : personajes) {
                writer.write(personajeFile.toCsv() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updatePersonaje(Personaje persona) {
        existeFichero(path);
        List<Personaje> personajes = obtenerPersonajes();
        try (FileWriter writer = new FileWriter(path)) {
            for (Personaje personajesFile : personajes) {
                if (personajesFile.equals(persona)) {
                    writer.write(persona.toCsv() + "\n");
                } else {
                    writer.write(personajesFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }


}
