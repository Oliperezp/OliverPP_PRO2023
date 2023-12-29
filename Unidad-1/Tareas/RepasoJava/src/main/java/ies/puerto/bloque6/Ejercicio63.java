package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio63 {

    //Escribe un programa que tome tu nombre y apellido ingresados por separado y muestre tu nombre completo
    // en una sola línea.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame tu nombre: ");
       String nombre=sc.nextLine();
        System.out.println("Dame tu apellido1: ");
       String apellido1=sc.nextLine();

        String respuesta = mostrarInformacion(nombre,apellido1);

        System.out.println(respuesta);
    }


    /**
     * Funcion que muestra la informacion de la persona
     * @param nombre
     * @param apellido1
     * @return la informacion de la persona
     */
    public static String mostrarInformacion(String nombre,String apellido1){

        return "Tu nombre es: " + nombre  + " " + apellido1;
    }

}
