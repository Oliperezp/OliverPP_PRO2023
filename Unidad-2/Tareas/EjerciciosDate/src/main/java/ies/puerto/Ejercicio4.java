package ies.puerto;

import java.util.Calendar;
import java.util.Date;

public class Ejercicio4 {

    //Implementar un programa que sume 10 días a la fecha actual utilizando la clase Calendar.


    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();



        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);


        System.out.println("Fecha Con 10 dias más :" + dia + "-" + mes + "-" + anio );




    }



}
