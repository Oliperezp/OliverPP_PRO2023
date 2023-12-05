package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {

    public static void main(String[] args) {

        //Implementa un programa que cuente el número de palabras en una cadena de texto. Considera
        // que las palabras pueden estar separadas por espacios, comas o puntos.

        String ordenador = "Maquina electronica capaz de almacenar informacion y tratarla automaticamente mediante" +
                " operaciones matematicas y logicas controladas por programas informaticos";




        String regex = "\\w+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ordenador);

        int contadorPalabras = 0;

        while (matcher.find()){

            contadorPalabras++;

        }

        System.out.println("El numero de palabras en el texto es de: " + contadorPalabras);
    }




}
