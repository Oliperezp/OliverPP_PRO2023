package ies.puerto;

import java.util.Calendar;

public class Ejercicio5 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();


        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH)-1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);


        System.out.println("Fecha Con 2 meses menos :" + dia + "-" + mes + "-" + anio );




    }


}




