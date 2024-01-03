package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio99 {

    public static void main(String[] args) {
        ingresarDatos();
    }

    public static void ingresarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero de dias que quieres sumarle: ");
        int numeroDias=sc.nextInt();

        sumarDias(numeroDias);

    }

    public static void sumarDias(int dias){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();


            calendar.add(calendar.DAY_OF_MONTH,dias);

            Date diasResultado=calendar.getTime();

            System.out.println("La fecha después de sumar " + dias + " días es: " + formato.format(diasResultado));




    }




}
