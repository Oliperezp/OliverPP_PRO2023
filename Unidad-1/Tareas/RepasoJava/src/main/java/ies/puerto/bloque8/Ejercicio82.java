package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio82 {

    //Desarrolla un programa que ordene un array de enteros en orden ascendente y luego lo muestre.
    // Solicita el tamaño del array, e introduce los valores.

    public static void main(String[] args) {

        introducirValores();
    }

    public static void introducirValores() {


        Scanner sc = new Scanner(System.in);


        System.out.println("¿Tamaño del array?: ");
        int tamanio = sc.nextInt();

        int[] arrayEnteros = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {

            System.out.println("Ingrese el valor de la posicion " + i);
            arrayEnteros[i] = sc.nextInt();
        }

        int[] arrayOrdenado=ordenarArray(arrayEnteros);

        for (int i = 0; i <arrayOrdenado.length ; i++) {

            System.out.print(arrayOrdenado[i] + " ");

        }
    }

    public static int[] ordenarArray(int[] array) {

        int[] arrayResultante = new int[array.length];
        int temporal = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temporal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporal;
                }
            }
        }
        return array;
    }
}