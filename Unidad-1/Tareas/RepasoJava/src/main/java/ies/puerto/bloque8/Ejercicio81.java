package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio81 {

    //Escribe un programa que sume todos los elementos de un array de enteros y muestre el resultado.
    // Solicita el tamaño del array, e introduce los valores, para ejecutar la suma.


    public static void main(String[] args) {

        introducirValores();

    }

    public static void introducirValores(){



        Scanner sc = new Scanner(System.in);


        System.out.println("¿Tamaño del array?: ");
        int tamanio=sc.nextInt();

        int[] arrayEnteros = new int[tamanio];

        for (int i = 0; i < tamanio ; i++) {

            System.out.println("Ingrese el valor de la posicion " + i);
            arrayEnteros[i]=sc.nextInt();




        }
        System.out.println("El valor de la suma del array es: " + sumarArray(arrayEnteros));

    }

    public static int sumarArray(int[] array){

        int suma=0;

        for (int i = 0; i < array.length; i++) {

            suma+=array[i];
        }
        return suma;
    }


}


