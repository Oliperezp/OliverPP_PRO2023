package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio84 {
    
//Haz un programa que calcule el promedio de las notas almacenadas en un array de decimales.
    
    public static void main(String[] args) {
        
      introducirValores();
    }

    public static void introducirValores() {


        Scanner sc = new Scanner(System.in);


        System.out.println("¿Tamaño del array?: ");
        int tamanio = sc.nextInt();

        double[] arrayEnteros = new double[tamanio];

        for (int i = 0; i < tamanio; i++) {

            System.out.println("Ingrese el valor de la posicion " + i);
            arrayEnteros[i] = sc.nextInt();
        }

        System.out.println("El promedio de las notas introducidas es de: " + promedio(arrayEnteros,tamanio));



    }



    public static double promedio(double[] array,int tamanio){

        double suma=0;
        double promedio=0;

        for (int i = 0; i < array.length ; i++) {

        suma+=array[i];
        }

        promedio=suma/tamanio;

        return promedio;
    }



    
}
