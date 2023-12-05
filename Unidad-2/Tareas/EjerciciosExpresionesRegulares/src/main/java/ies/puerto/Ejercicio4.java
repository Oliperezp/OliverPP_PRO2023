package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Escribe un programa que cuente el número de palabras en formato Camel Case
        // (palabras concatenadas sin espacios) en una cadena.


        String palabraCamelCase = "sumarTodosLosNumeros";


        String regex = "[a-z]+|[A-Z][a-z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher coincide = pattern.matcher(palabraCamelCase);

         int contadorDePalabras = 0;

         while (coincide.find()) {

            contadorDePalabras++;


        }


        System.out.println("El numero de palabras camelCase son:" + contadorDePalabras);
    }
}