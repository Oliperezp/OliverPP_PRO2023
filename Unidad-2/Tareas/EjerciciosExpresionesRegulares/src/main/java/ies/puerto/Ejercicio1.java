package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

    public static void main(String[] args) {

        String correo = "correo@dominio.com";


        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if(matcher.matches()){

            System.out.println("El correo es correcto");

        }else{

            System.out.println("El correo no es correcto");
        }

    }

}
