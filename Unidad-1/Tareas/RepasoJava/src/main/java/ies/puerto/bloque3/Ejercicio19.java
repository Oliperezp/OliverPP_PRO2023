package ies.puerto.bloque3;

import java.util.Scanner;

public class Ejercicio19 {

    //Desarrolla un programa que tome dos cadenas ingresadas por el usuario y muestre la concatenación de ambas,
    // así como su longitud.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba una frase: ");
        String cadena1 = sc.nextLine();
        System.out.println("Escriba otra frase");
        String cadena2 = sc.nextLine();

        System.out.println(cadena1 + ". " + cadena2);
        System.out.println("El tamaño de la cadena 1 es: " +cadena1.length() + " El tamaño de la cadena 2 es: " + cadena2.length());

    }
}
