package es.ies.puerto.modelo.abstractas;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;

import java.io.*;
import java.util.List;

public class FicherosAbstractas implements ICrudOperaciones {

    public static final String RUTA_CSV="src/main/resources/personas.csv";
    public static final String RUTA_XML="src/main/resources/personas.xml";
    public static final String RUTA_JSON="src/main/resources/personas.json";
    public static final String SEPARADOR=",";


    @Override
    public boolean existe(String path){
        if (path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    @Override
    public boolean actualizar(List<Personaje> personas) {
        return false;
    }

    @Override
    public boolean escribir(List<Personaje> personas) {
        return false;
    }

    @Override
    public boolean modificar(List<Personaje> personas) {
        return false;
    }

    @Override
    public List<Personaje> leer() {
        return null;
    }

    @Override
    public boolean eliminar(String path){
        if (existe(path)) {
            File file = new File(path);
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                byte[] vacio = {};
                fileOutputStream.write(vacio);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
