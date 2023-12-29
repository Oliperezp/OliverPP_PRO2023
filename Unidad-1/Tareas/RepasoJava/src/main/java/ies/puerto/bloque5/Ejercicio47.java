package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio47 {

    //Crea un programa que solicite al usuario un número (puede ser entero o decimal) y determine si es divisible por 5.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero (entero o decimal): ");
        double numero=sc.nextDouble();


        System.out.println(esDivisible(numero));

    }

    /**
     * Funcion que determinar si el numero es divisible por 5
     * @param numero
     * @return el mensaje de si es o no es divisible por 5
     */
    public static String esDivisible(double numero){


        if(numero%5==0){

            return ("El numero es divisible entre 5");

        }else{
          return ("El numero no es divisible entre 5");
        }

    }

}
