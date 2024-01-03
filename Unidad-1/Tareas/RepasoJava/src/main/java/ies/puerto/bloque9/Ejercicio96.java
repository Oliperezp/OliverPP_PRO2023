package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio96 {


    //Desarrolla un programa que permita al usuario ingresar una fecha y un número de días, y calcule la fecha resultante después de sumar esos días.

    public static void main(String[] args) {
     ingresarDatos();
    }

    public static void ingresarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la primera fecha en formato dd/MM/yyyy: ");
        String fecha = sc.nextLine();
        System.out.println("Dame el numero de dias que quieres sumarle: ");
       int numeroDias=sc.nextInt();

          sumarDias(fecha,numeroDias);

    }

    public static void sumarDias(String fecha,int dias){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        try{

            Date fechaStr = formato.parse(fecha);

            calendar.setTime(fechaStr);
            calendar.add(calendar.DAY_OF_MONTH,dias);

            Date diasResultado=calendar.getTime();

            System.out.println("La fecha después de sumar " + dias + " días es: " + formato.format(diasResultado));

        }catch (ParseException exception){
            System.out.println("Error, formato no válido");
        }


    }


}
