package es.ies.puerto.modelo.abstractas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FicherosAbstractas {

    public boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public  boolean almacenarEnFichero(String path, String texto) {
        if (!existeFichero(path)) {
            return false;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
