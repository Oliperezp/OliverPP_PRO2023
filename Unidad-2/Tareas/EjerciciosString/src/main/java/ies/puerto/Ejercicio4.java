package ies.puerto;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Implementa un programa que invierta una cadena de texto dada.


        String texto = "oliver";
        String textoInverso = "";

        for (int i = texto.length()-1; i>=0 ; i--) {

            char letra = texto.charAt(i);

            textoInverso+=letra;



        }

        System.out.println("El texto invertido es :" + textoInverso);


    }



}
