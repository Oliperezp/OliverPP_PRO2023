package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio83 {

    //Crea un programa que busque un número específico en un array y muestre su posición si se encuentra,
    // o un mensaje indicando que no se encontró.

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

        System.out.println("¿Que numero quieres buscar en el array?");
        int numero=sc.nextInt();

        buscarNumeroEnArray(numero,arrayEnteros);

    }





            public static void buscarNumeroEnArray(int numero, int[] array) {

                for (int i = 0; i < array.length; i++) {
                    if (array[i] == numero) {
                        System.out.println("El número " + numero + " se encuentra en la posición " + i );
                        return;
                    }
                }

                System.out.println("El número " + numero + " no esta en el array.");
            }
        }




