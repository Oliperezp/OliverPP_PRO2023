package impl;

import java.util.ArrayList;
import java.util.List;

public class ElementosDuplicados {

    //Crea un programa que elimine los elementos duplicados de un ArrayList de cadenas y muestre la lista resultante.
    static List<String> palabras;


    public static void main(String[] args) {

        palabras=new ArrayList<>();

        palabras.add("Tamara");
        palabras.add("Chimuelo");
        palabras.add("Ambrusio");
        palabras.add("Ambrusio");
        palabras.add("Chimuelo");

        System.out.println("Sin eliminar:" + palabras);


        eliminarDuplicados();

        System.out.println("Eliminando:" +palabras);



    }


    public static void eliminarDuplicados() {
        List<String> sinDuplicados = new ArrayList<>();

        for (String palabra : palabras) {
            if (!sinDuplicados.contains(palabra)) {
                sinDuplicados.add(palabra);
            }
        }

        palabras.clear();
        palabras.addAll(sinDuplicados);
    }


}
