package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza el ejercicio numero 1 de las tareas
 */
public class EjercicioNumeroPerfecto {


    /**
     * Descripcion del ejericio: Un número perfecto es aquel que es igual a la suma de sus divisores propios (excluyendo él mismo).
     * Por ejemplo, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3, y 1 + 2 + 3 = 6.
     * El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000)
     * @param args
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("El numero perfecto");
        System.out.println("******************");

        /**
         * Se le pide al usuario un rango desde el 1 hasta X numero introducido por teclado
         */

        int rango;
        int suma;

        System.out.println("¿Hasta que numero quieres llegar?:");
        rango=sc.nextInt();

        for (int i = 1; i <rango ; i++) {  //i es el numero que queremos comprobar

            suma=0;

            for (int j = 1; j <i ; j++) { //j es el divisor con el que vamos a probar

                if(i%j==0){ //si el producto del numero es 0 es divisor

                    suma+=j;  //entonces se suma

                }



            }

            if(i==suma){  // si el numero coincide con la suma es el que queremos
                System.out.println("El numero" +i + "es perfecto");
            }


        }




    }
}