package ies.puerto;

import java.util.Calendar;
import java.util.Date;

public class Ejercicio7 {

    public static void main(String[] args) {

        //Escribir un programa que calcule la diferencia en días entre dos fechas utilizando la clase Calendar

        Calendar calendar = Calendar.getInstance();
        Calendar segundoCalendar = Calendar.getInstance();


        segundoCalendar.add(calendar.DAY_OF_MONTH,5);


        Date primeraFecha = segundoCalendar.getTime();
        Date segundaFecha = calendar.getTime();

        System.out.println("Primera fecha :" + primeraFecha);
        System.out.println("Segunda fecha :" + segundaFecha);



        int resultado =segundoCalendar.compareTo(calendar);

        System.out.println("El resultado entre las dos fechas es :" + resultado);

    }

}
