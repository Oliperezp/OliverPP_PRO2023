package ies.puerto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto= "";
        System.out.println("Dame la cadena de texto, contaré las vocales: ");
        texto = sc.nextLine();

        System.out.println("La cantidad de vocales en el texto es: " + contarVocales(texto));

    }


    public static int contarVocales(String texto){

        int cantidadVocales=0;

        for (int i = 0; i <texto.length() ; i++) {

            char letra = texto.charAt(i);


            switch (letra){

                case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
                    cantidadVocales ++;
                    break;

            }

        }

      return  cantidadVocales;
    }


}
