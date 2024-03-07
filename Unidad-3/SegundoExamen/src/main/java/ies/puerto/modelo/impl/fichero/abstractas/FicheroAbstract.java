package ies.puerto.modelo.impl.fichero.abstractas;

import ies.puerto.modelo.impl.abstractas.Producto;

import java.io.*;

public abstract class FicheroAbstract {

    public String FICHERO_ALIMENTOS= "";
    public  String FICHERO_APARATOS= "";
    public  String FICHERO_CUIDADO_PERSONAL= "";
    public String FICHERO_SOUVENIRS= "";

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

    public boolean borrarProducto(String path, Producto producto) {

        if (!existeFichero(path)) {
            return false;
        }

        File fichero = new File(path);
        File nuevoFichero = new File("producto.csv");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoFichero));

            String lineaActual;

            while ((lineaActual = reader.readLine()) != null) {
                String[] campos = lineaActual.split(",");

                if (!campos[0].equals(producto.getId())) {
                    writer.write(lineaActual + "\n");
                }
            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado" + e.getMessage());
        }
        return true;
    }
    public boolean actualizarProducto(String path, String id, String nuevoNombre, float nuevoPrecio,String nuevaFechaEntrada,
        String nuevaFechaCaducidad) {

            if (!existeFichero(path)) {
                return false;
            }

            File inputFile = new File(path);
            File tempFile = new File("productos.csv");

            try {
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String lineaActual;

                while ((lineaActual = reader.readLine()) != null) {

                    String[] campos = lineaActual.split(",");

                    if (campos.length > 0 && campos[0].equals(id)) {

                        campos[0] = nuevoNombre;
                        campos[1] = String.valueOf(nuevoPrecio);
                        campos[2] = nuevaFechaEntrada;
                        campos[5] = nuevaFechaCaducidad;
                        lineaActual = String.join(",", campos);
                    }

                    writer.write(lineaActual + "\n");
                }

            } catch (IOException e) {
                System.out.println("Archivo no encontrado: " + e.getMessage());
            }
            return true;
        }


}







