package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio100 {


    //Haz un programa que determine si una fecha ingresada por el usuario corresponde a un día festivo específico
    // (por ejemplo, Navidad o Año Nuevo) y muestre un mensaje adecuado.

    public static void main(String[] args) {
        ingresarDatos();
    }

    public static void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una fecha en formato dd/MM/yyyy: ");
        String fechaIngresada = sc.nextLine();

        verificarDiaFestivo(fechaIngresada);
    }

    public static void verificarDiaFestivo(String fechaIngresada) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fecha = formato.parse(fechaIngresada);


            Calendar navidad = Calendar.getInstance();
            navidad.set(Calendar.MONTH, Calendar.DECEMBER);
            navidad.set(Calendar.DAY_OF_MONTH, 25);


            if (sonFechasIguales(fecha, navidad.getTime())) {
                System.out.println("¡Es Navidad!");
            } else {
                System.out.println("No es un día festivo específico.");
            }

        } catch (ParseException exception) {
            System.out.println("Error, formato no válido (dd/MM/yyyy)");
        }
    }


    private static boolean sonFechasIguales(Date fecha1, Date fecha2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(fecha1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(fecha2);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }



}
