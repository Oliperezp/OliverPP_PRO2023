package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio48 {

    //Desarrolla un programa que tome dos cadenas ingresadas por el usuario y determine si tienen la misma longitud.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribre una frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Dame la segunda frase: ");
        String frase2=sc.nextLine();

        System.out.println(longitudFrases(frase1,frase2));


    }

    /**
     * Funcion que compara el tamaño de dos frases
     * @param frase1
     * @param frase2
     * @return mensaje de si las frases son iguales en tamaño o no
     */
    public static String longitudFrases(String frase1,String frase2){

        int longitud1 = frase1.length();
        int longitud2 = frase2.length();


        if(longitud1==longitud2){
            return ("Las frases tienen la misma longitud");

        }else {
           return ("Las frases no tienen la misma longitud");
        }



    }

}
