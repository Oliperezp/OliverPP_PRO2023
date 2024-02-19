package ies.puerto.presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {

    public static void main(String[] args) {

        List<Articulo> alimentos = lecturaAlimentos("src/main/resources/alimentos.csv");
        System.out.println(alimentos);


        lecturaAlimentos("src/main/resources/aparatos.csv");
        lecturaAlimentos("src/main/resources/cuidadoPersonal.csv");
        lecturaAlimentos("src/main/resources/souvenirs.csv");

    }

    public static boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }


    // Ejemplo básico de lectura de ficheros linea a linea
    public static List<Articulo> lecturaAlimentos(String path) {

        List<Articulo> articulos = new ArrayList<>();

        if(existeFichero(path)){

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            int i = 0;
            // Leer cada línea del fichero
            while ((linea = br.readLine()) != null) {
                if (i > 0) {
                    String[] alimentoArray = linea.split(",");
                    Alimento alimento = new Alimento(alimentoArray[3], Float.parseFloat(alimentoArray[0]), alimentoArray[1], alimentoArray[2], alimentoArray[4]);
                    articulos.add(alimento);
                }
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }else{
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }

    public static List<Articulo> lecturaAparatos(String path) {

        List<Articulo> articulos = new ArrayList<>();

        if(existeFichero(path)){

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            int i = 0;
            // Leer cada línea del fichero
            while ((linea = br.readLine()) != null) {
                if (i > 0) {
                    String[] aparatosArray = linea.split(",");
                    Aparato aparato = new Aparato(aparatosArray[3], Float.parseFloat(aparatosArray[0]), aparatosArray[1], aparatosArray[2], aparatosArray[4]);
                    articulos.add(aparato);
                }

                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }else{
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }

    public static List<Articulo> lectura(String path,String articulo) {

        List<Articulo> articulos = new ArrayList<>();

        if(existeFichero(path)){

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i >0) {
                        switch (articulo){
                            case "alimento":
                                break;
                            case "aparato":case "souvenir":
                                break;
                            default:
                                break;
                        }
                    }

                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }



}


