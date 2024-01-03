package ies.puerto.bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio95 {

    //Haz un programa que compare dos fechas ingresadas por el usuario y determine cuál es anterior, o si son iguales.

    public static void main(String[] args) {

        ingresarDatos();
    }

    public static void ingresarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la primera fecha en formato dd/MM/yyyy: ");
        String fecha = sc.nextLine();
        System.out.println("Dame la primera fecha en formato dd/MM/yyyy: ");
        String fechaDos = sc.nextLine();

        compararFechas(fecha,fechaDos);

    }

    public static void compararFechas(String fechaUno,String fechaDos){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fecha = formato.parse(fechaUno);
            Date fecha2= formato.parse(fechaDos);

            if(fecha.equals(fecha2)){
                System.out.println("Las fechas son iguales");
            } else if (fecha.before(fecha2)) {

                System.out.println("La fecha uno es anterior a la segunda fecha");

            }else{

                System.out.println("La fecha uno es posterior a la segunda fecha");
            }


        }catch (ParseException exception){
            System.out.println("Error, el formato no es válido (dd/MM/yyyy)");
        }



    }


}
