package ies.puerto;

import java.util.Calendar;
import java.util.Date;

public class Ejercicio10 {

    public static void main(String[] args) {

        //Desarrollar un programa que verifique si la fecha actual es un sábado o domingo utilizando la clase Calendar
        //y muestre un mensaje apropiado.


        Calendar calendar = Calendar.getInstance();

        //calendar.set(calendar.DAY_OF_WEEK,7);

        int diaDeLaSemana = calendar.get(Calendar.DAY_OF_WEEK);


        if (diaDeLaSemana == Calendar.SATURDAY) {
            System.out.println("El día es Sabado ");
        }else if(diaDeLaSemana == Calendar.SUNDAY) {
            System.out.println("El día es Domingo");
        }else{
            System.out.println("Lo siento,no es fin de semana");
        }
    }


}




