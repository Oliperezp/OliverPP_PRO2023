package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio98 {

    //Escribe un programa que calcule y muestre el número de días entre dos fechas ingresadas por el usuario

    public static void main(String[] args) {

        ingresarDatos();
    }

    public static void ingresarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la primera fecha en formato dd/MM/yyyy: ");
        String fecha = sc.nextLine();
        System.out.println("Dame la primera fecha en formato dd/MM/yyyy: ");
        String fechaDos = sc.nextLine();

        mostrarDatosUsuario(fecha,fechaDos);
    }

    public static void mostrarDatosUsuario(String fecha,String fechaDos){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


        try{
            Date fechaUnoStr = formato.parse(fecha);
            Date fechaDosStr = formato.parse(fechaDos);

            Calendar calendarUno = Calendar.getInstance();
            Calendar calendarDos=Calendar.getInstance();

            calendarUno.setTime(fechaUnoStr);
            calendarDos.setTime(fechaDosStr);



            long diferenciaMillis = calendarDos.getTimeInMillis() - calendarUno.getTimeInMillis();
            long diferenciaSegundos = diferenciaMillis / 1000;
            long diferenciaMinutos = diferenciaSegundos / 60;
            long diferenciaHoras = diferenciaMinutos / 60;
            long diferenciaDias = diferenciaHoras / 24;

            System.out.println("La diferencia de días entre las dos fechas es: " + diferenciaDias + " días.");



        }catch (ParseException exception){

            System.out.println("Error, formato no válido (dd/MM/yyyy)");
        }




    }



}
