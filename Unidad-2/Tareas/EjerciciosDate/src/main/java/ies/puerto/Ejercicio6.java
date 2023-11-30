package ies.puerto;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        //Desarrollar un programa que compare dos fechas utilizando la clase Date y muestre si son iguales o diferentes.



        Calendar calendar = Calendar.getInstance();

        Date fechaActual = new Date();
        Date otraFecha = new Date();

        calendar.add(calendar.DAY_OF_MONTH,5);

        Date segundaFecha = calendar.getTime();


        System.out.println("Primera fecha :" + fechaActual);
        System.out.println("Segunda fecha :" + segundaFecha);

        if(compararFechas(fechaActual,segundaFecha)){

            System.out.println("Las fechas son iguales");

        }else{

            System.out.println("Las fechas son diferentes");
        }




    }

    public static boolean compararFechas(Date fecha1,Date fecha2){

        return  fecha1.equals(fecha2);
    }

}
