package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio93 {

    //Crea un programa que determine el día de la semana de una fecha ingresada por el usuario
    // (por ejemplo, lunes, martes, etc.).

    public static void main(String[] args) {
     ingresarDatos();

    }

    public static void ingresarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la fecha en formato dd/MM/yyyy: ");
        String fecha = sc.nextLine();

        diaDeLaSemana(fecha);

    }

    public static void diaDeLaSemana(String fecha){

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDate = formato.parse(fecha);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaDate);

            int numeroDiaSemana = calendar.get(Calendar.DAY_OF_WEEK);


            String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
            String dia = diasSemana[numeroDiaSemana - 1];

            System.out.println("El día de la semana para la fecha " + fecha + " es: " + dia);

        } catch (ParseException e) {
            System.out.println("Error, usa el formato dd/MM/yyyy.");
        }
    }

    }



