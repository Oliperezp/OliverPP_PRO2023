package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {

    public static void main(String[] args) {

        //Crea un programa que valide si una cadena representa un número de tarjeta de crédito válido según
        // un formato específico.

        //Tarjeta de credito XXXX XXXX XXXX XXXX

        String tarjetaCredito = "5666 2641 9998 0120";


        String regex = "\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher coincide = pattern.matcher(tarjetaCredito);


        if(coincide.matches()){

            System.out.println("La tarjeta es válida");

        }else{
            System.out.println("Numero de tarjeta erróneo");
        }


    }


}
