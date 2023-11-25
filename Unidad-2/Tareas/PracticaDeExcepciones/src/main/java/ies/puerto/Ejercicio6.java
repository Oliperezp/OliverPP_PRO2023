package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) throws Exception {

    transformarStrFecha();

   }


    /**
     * Metodo para transformar un string de fecha en un date
     * @throws Exception
     */
    public static void transformarStrFecha() throws Exception{

        try{

            String fechaStr="";

            Scanner sc = new Scanner(System.in);
            SimpleDateFormat fechaTipo = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Introduzca una fecha: ");
            fechaStr=sc.nextLine();

            Date fecha=fechaTipo.parse(fechaStr);

            System.out.println("Fecha: " + fecha);

        }catch (ParseException exception){

            throw new Exception("La fecha introducida no es válida, el formato no es válido");
        }


    }






}
