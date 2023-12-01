package ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Desarrolla un programa que cuente el número de vocales en una cadena de texto.

        int contadorVocales = 0;
        String cadenaTexto = "¿HolA como estas?";


        for (int i = 0; i <cadenaTexto.length() ; i++) {

            char letra= cadenaTexto.charAt(i);

            switch (letra){

                case 'a':case 'e': case 'i': case 'o': case 'u': case 'A':case 'E':case 'I':case 'O':case 'U':
                    contadorVocales ++;
                    break;
            }

        }

        System.out.println("El numero de vocales es :" + contadorVocales);

    }

}
