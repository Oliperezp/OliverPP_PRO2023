package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

    public static void main(String[] args) {

        String fecha = "31/10/1987";


        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";

        Pattern pattern = Pattern.compile(regex);

        Matcher coincide = pattern.matcher(fecha);

        if(coincide.matches()){

            System.out.println("La fecha introducida es correcta");
        }else {
            System.out.println("La fecha es incorrecta");
        }


    }

}
