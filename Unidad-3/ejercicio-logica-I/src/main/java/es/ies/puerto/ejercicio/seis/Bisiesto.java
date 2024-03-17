package es.ies.puerto.ejercicio.seis;

import java.util.Scanner;

public class Bisiesto {


    public static boolean is(int anio) {
        boolean resultado = false;


        if(((anio%4==0 && anio%10==0)) || (anio%400==0)){
            resultado=true;
        }

        return resultado;
    }
}
