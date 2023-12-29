package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {

        //Escribe un programa que determine si una variable booleana ingresada por el usuario es verdadera
        // o falsa y muestre un mensaje correspondiente.

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa una variable (true o false): ");
        boolean variable = sc.nextBoolean();


         if(variable){
             System.out.println("La variable es verdadera");

         }else{

             System.out.println("La variable es falsa");
         }





    }

}
