package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio8 {


    public static void main(String[] args) throws ParseException {

        //Implementar un programa que parsee una cadena en formato "dd-MM-yyyy" a un objeto Date utilizando SimpleDateFormat.


       String fechaStr = "31-10-1987";

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        Date fecha=formatoFecha.parse(fechaStr);

        System.out.println("Fecha: " + fecha);




    }



}
