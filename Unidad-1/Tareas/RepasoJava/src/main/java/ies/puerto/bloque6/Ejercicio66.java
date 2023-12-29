package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio66 {

    //Haz un programa que tome una frase y una palabra ingresada por el usuario, luego determine si la
    // palabra está contenida en la frase.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el texto: ");
        String texto1=sc.nextLine();
        System.out.println("Dame la palabra que quieres ver si esta: ");
        String palabra=sc.nextLine();

        System.out.println("¿La palabra que has introducido esta en el texto?: " + buscarPalabra(texto1,palabra));
    }


    public static boolean buscarPalabra(String texto,String palabra){

        boolean resultado = texto.contains(palabra);

        return resultado;
    }


}
