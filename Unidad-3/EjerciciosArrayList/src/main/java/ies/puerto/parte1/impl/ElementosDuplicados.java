package ies.puerto.parte1.impl;

import java.util.ArrayList;
import java.util.List;

public class ElementosDuplicados {

    //Crea un programa que elimine los elementos duplicados de un ArrayList de cadenas y muestre la lista resultante.
    static List<String> nombres;


    public static void main(String[] args) {

        nombres =new ArrayList<>();

        nombres.add("Tamara");
        nombres.add("Chimuelo");
        nombres.add("Ambrusio");
        nombres.add("Ambrusio");
        nombres.add("Chimuelo");

        System.out.println("Sin eliminar:" + nombres);
        System.out.println("Sin duplicados:" + eliminarCadenasDuplicadas(nombres));
    }


    public static List<String> eliminarCadenasDuplicadas(List<String> lista){
        List<String> resultado = new ArrayList<>();

        for (String palabra:lista) {
            if(!resultado.contains(palabra)){
                resultado.add(palabra);
            }
        }

        return resultado;
    }





}
