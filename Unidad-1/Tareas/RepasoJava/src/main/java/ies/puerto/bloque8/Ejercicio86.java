package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio86 {

    public static void main(String[] args) {
        introducirValores();
    }

    public static void introducirValores() {


        Scanner sc = new Scanner(System.in);


        System.out.println("¿Tamaño de las matrices?: ");
        int tamanio = sc.nextInt();

        int[][] matrizUno = new int[tamanio][tamanio];
        int[][] matrizDos = new int[tamanio][tamanio];

        System.out.println("Valores para la matriz Uno");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

                System.out.println("Ingrese el valor de la posicion " + i + " " + j);
                matrizUno[i][j] = sc.nextInt();
            }


        }
        System.out.println("Valores para la matriz Dos");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

                System.out.println("Ingrese el valor de la posicion " + i + " " + j);
                matrizDos[i][j] = sc.nextInt();
            }


        }

        int[][] matrizResultado = sumarMatrices(matrizUno, matrizDos);


        System.out.println();
        System.out.println("Matrices sumadas resultado: ");
        mostrarMatriz(matrizResultado);

    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }


    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}