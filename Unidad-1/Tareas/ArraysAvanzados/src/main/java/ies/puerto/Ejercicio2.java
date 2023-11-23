package ies.puerto;

import java.util.Scanner;


public class Ejercicio2 {

    public void pedirNumeros() {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        int i = 0;
        int numero = 0;

        do {

            System.out.println("Dame el numero: ");
            numero = sc.nextInt();

            array[i] = numero;

            i++;

        } while (i < array.length && numero < 0);

       mostrarArray(array,i);

    }

    public void mostrarArray(int[] array,int total){

        for (int i = 0; i <= total ; i++) {

            System.out.println(array[i]);
        }

    }




}