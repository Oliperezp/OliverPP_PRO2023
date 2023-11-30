package ies.puerto;

import java.util.Calendar;
import java.util.Date;

public class Ejercicio4 {

    //Implementar un programa que sume 10 días a la fecha actual utilizando la clase Calendar.


    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();


        calendar.add(calendar.DAY_OF_MONTH,10);

        Date nuevaFecha = calendar.getTime();


        System.out.println("Fecha Con 10 dias más :" + nuevaFecha );




    }



}
