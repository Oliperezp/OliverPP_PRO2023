package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio60 {


    //Escribe un programa que compare dos cadenas ingresadas por el usuario y determine si son iguales o diferentes.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la primera frase: ");
        String texto1=sc.nextLine();
        System.out.println("Dame la segunda frase: ");
        String texto2=sc.nextLine();

        boolean respuesta=sonIguales(texto1,texto2);
        System.out.println();
        System.out.println("¿Las frases son iguales?: " + respuesta);

    }


    /**
     * Funcion que compara dos cadenas si son iguales o no
     * @param texto1
     * @param texto2
     * @return true o false
     */
    public static boolean sonIguales(String texto1,String texto2){

        boolean respuesta = texto1.equals(texto2);

        return respuesta;

    }


}



