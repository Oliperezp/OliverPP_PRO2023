package ies.puerto.Bloque1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Escribe un programa que muestre tu nombre, tu edad y tu hobby favorito en líneas separadas,
        // similar a un perfil básico.

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        String hobby;

        System.out.println("Dame tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("¿Cual es tu edad?: ");
        edad=sc.nextInt();
        System.out.println("¿Cual es tu hobby?: ");
        hobby=sc.nextLine();sc.nextLine();


        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Tu hobby es: " + hobby);

    }


}
