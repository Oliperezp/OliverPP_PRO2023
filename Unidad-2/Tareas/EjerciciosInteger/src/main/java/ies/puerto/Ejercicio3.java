package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    //Desarrolla un programa que determine si un número entero es primo o no utilizando los métodos de la clase Integer.

    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Dame un numero te diré si es primo o no :");
            Integer numero = sc.nextInt();

            int valorInt = numero.intValue();

            System.out.println("El numero "+numero+" es Primo?:" + esPrimo(numero));



        }catch (InputMismatchException exception){
            System.out.println("No se ha introducido un numero sino una cadena de texto");


        }

    }


    /**
     * Funcion que calcula si un numero es primo
     * @param numero
     * @return true o false
     */
     public static boolean esPrimo(int numero){

         boolean esPrimo=false;
         int cantidadNumeroDivisibles =0;
         int cantidadNumerosDivisiblesPrimo=2;

         for (int i = 1; i < numero ; i++) {

             if(numero%2==0){
                 cantidadNumeroDivisibles++;

             }

             if(cantidadNumeroDivisibles==cantidadNumerosDivisiblesPrimo){
                 esPrimo=true;
             }

         }

         return esPrimo;
     }


}
