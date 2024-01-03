package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio85 {

    //Escribe un programa que cuente cuántas veces aparece un número específico en un array de enteros

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

        System.out.println("¿Que numero buscas en el array?:");
        int numero=sc.nextInt();

        System.out.println("El numero que buscas esta: " + buscarNumeroEnArray(numero,arrayEnteros) + " veces");

    }




    public static int buscarNumeroEnArray(int numero, int[] array) {

        int contador=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                contador++;
            }
        }

       return contador;
    }


}
