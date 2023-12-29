package ies.puerto.Bloque1;

import java.util.Scanner;

public class Ejercicio2 {

  //Crea un programa que solicite al usuario su nombre y luego muestre "¡Hola, [nombre]!",
    // donde [nombre] es el nombre proporcionado por el usuario.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.println("Dame tu nombre: ");
        nombre=sc.nextLine();

        System.out.println("¡Hola," + nombre + "!");



    }



}
