package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Desarrolla un programa que extraiga todos los números de teléfono válidos (con formato +XX-XXX-XX-XX-XX)
        // de una cadena dada. (Convina lo aprendido).

        String telefono = "+34-922-34-33-22";


        String regex = "^(\\+[0-9]{2})-([0-9]{3})-([0-9]{2})-([0-9]{2})-([0-9]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefono);


        if(matcher.matches()){

            System.out.println("El telefono es correcto");

            String numeroPais = matcher.group(1);
            String prefijo = matcher.group(2);
            String primerNumero=matcher.group(3);
            String segundoNumero=matcher.group(4);
            String tercerNumero=matcher.group(5);

            System.out.println("Numero país: " + numeroPais + "\n" + "Prefijo: " + prefijo + "\n" + "Primer numero: " + primerNumero
            + "\n" + "Segundo numero: " + segundoNumero + "\n" + "Tercer Numero: " + tercerNumero);


        }else{

            System.out.println("El telefono no es correcto");
        }







    }



}
