package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio97 {

    //Crea un programa que solicite al usuario ingresar su fecha de nacimiento y muestre su edad exacta en años, meses y días.

    public static void main(String[] args) {

        ingresarDatos();
    }

    public static void ingresarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame tu fecha de nacimiento en formato dd/MM/yyyy: ");
        String fecha = sc.nextLine();


        mostrarDatosUsuario(fecha);


    }


    public static void mostrarDatosUsuario(String fecha){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar fechaActual= Calendar.getInstance();

        try{
            Date fechaStr = formato.parse(fecha);

            Calendar fechaUsuario=Calendar.getInstance();

            fechaUsuario.setTime(fechaStr);

            int edadAnios = fechaActual.get(Calendar.YEAR) - fechaUsuario.get(Calendar.YEAR);
            int diferenciaMeses = fechaActual.get(Calendar.MONTH) - fechaUsuario.get(Calendar.MONTH);
            int diferenciaDias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaUsuario.get(Calendar.DAY_OF_MONTH);


            if (diferenciaMeses < 0 || (diferenciaMeses == 0 && diferenciaDias < 0)) {
                edadAnios--;
            }

            int meses = (diferenciaMeses < 0) ? 12 + diferenciaMeses : diferenciaMeses;
            int dias = (diferenciaDias < 0) ? fechaActual.getActualMaximum(Calendar.DAY_OF_MONTH) + diferenciaDias : diferenciaDias;

            System.out.println("Tu edad es: " + edadAnios + " años, " + meses + " meses y " + dias + " días.");


        }catch (ParseException exception){

            System.out.println("Error, formato no válido (dd/MM/yyyy)");
        }




    }


}
