package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio41 {

    //Escribe un programa que compare dos números enteros ingresados por el usuario y muestre cuál es mayor o si son iguales.

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero 1: ");
        int numero1=sc.nextInt();
        System.out.println("Dame el numero 2: ");
        int numero2=sc.nextInt();

        String resultado=esMayor(numero1,numero2);


        System.out.println(resultado);

    }

    /**
     * Funcion que compara dos numeros y muestra cual es el mayor o si son iguales
     * @param numero1
     * @param numero2
     * @return el texto de los numeros comparados
     */
    public  static String esMayor(int numero1,int numero2){

       int resultado=Integer.compare(numero1,numero2);

       switch (resultado){
           case 1:
              return "El numero 1 es mayor que el numero 2";
           case -1:
              return  "El numero 2 es mayor que el numero 1";
           default:
               return "Los numeros son iguales";


       }


    }



}
