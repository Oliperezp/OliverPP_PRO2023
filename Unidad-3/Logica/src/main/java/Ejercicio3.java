package main.java;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la frase: ");
        String palabra = sc.nextLine();

        System.out.println("La frase invertida es: " + invertirCadena(palabra));
        }

    public static String invertirCadena(String texto){

        String textoInvertido="";

        for (int i = texto.length()-1; i>=0 ; i--) {

            char letra = texto.charAt(i);

            textoInvertido+=letra;

        }




        return textoInvertido;
    }



    }

