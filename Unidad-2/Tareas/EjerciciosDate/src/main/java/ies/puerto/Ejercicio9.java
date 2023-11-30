package ies.puerto;

import java.util.Calendar;
import java.util.Date;

public class Ejercicio9 {

    public static void main(String[] args) {

       // Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.

        Calendar calendar = Calendar.getInstance();

       int dia = calendar.get(calendar.DAY_OF_MONTH);

       calendar.set(calendar.DAY_OF_MONTH,1);

       int primerDia = calendar.get(calendar.DAY_OF_MONTH);


        System.out.println(primerDia);


    }


}


