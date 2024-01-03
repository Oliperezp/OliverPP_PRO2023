package ies.puerto.bloque9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio91 {

    public static void main(String[] args) {

        mostrarFecha();
    }


    public static void mostrarFecha(){

        Date fechaActual = new Date();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");

        String fechaFormato=simpleDateFormat.format(fechaActual);

        System.out.println("La fecha actual es: " + fechaFormato);

    }


}
