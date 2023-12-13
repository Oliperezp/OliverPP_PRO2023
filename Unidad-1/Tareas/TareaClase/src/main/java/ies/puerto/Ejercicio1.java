package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {

    // Implementa un programa que invierta una cadena de texto dada. La cadena debe de tener al menos 10 caracteres no vacíos

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto="";

        do{

            System.out.println("Dame la cadena de texto de mas de 10 caracteres: ");
            texto=sc.nextLine();

        }while (texto.length()<10);

        System.out.println("El texto invertido es: " + invertirCadena(texto));



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
