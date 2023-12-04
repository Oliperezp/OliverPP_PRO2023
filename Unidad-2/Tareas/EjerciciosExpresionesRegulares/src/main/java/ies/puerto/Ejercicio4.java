package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Escribe un programa que cuente el número de palabras en formato Camel Case
        // (palabras concatenadas sin espacios) en una cadena.


        String palabraCamelCase="sumarTodo";


        String regex = "\\w+[A-Z]\\w";

        Pattern pattern = Pattern.compile(regex);
        Matcher coincide = pattern.matcher(palabraCamelCase);




    }


}
