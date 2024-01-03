package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio92 {

    //Desarrolla un programa que calcule y muestre cuántos días han pasado desde una fecha ingresada por el
    // usuario hasta la fecha actual

    public static void main(String[] args) {

        ingresarDatos();
    }


    public static void ingresarDatos(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Dame la primera fecha en formato dd/MM/yyyy: ");
        String fecha=sc.nextLine();
        System.out.println("Dame la segunda fecha en formato dd/MM/yyyy: ");
        String fechaDos=sc.nextLine();


        calcularDias(fecha,fechaDos);
    }

    public static void calcularDias(String fechaUnoStr,String fechaDosStr){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
             Date fechaUno = formato.parse(fechaUnoStr);
             Date fechaDos = formato.parse(fechaDosStr);

            long diferencia = fechaDos.getTime() - fechaUno.getTime();
            long diasDiferencia = diferencia / (24 * 60 * 60 * 1000);

            System.out.println("Días transcurridos: " + diasDiferencia);

        } catch (ParseException e) {
            System.out.println("Formato incorrecto es (dd/MM/yyyy).");
        }
    }





}


