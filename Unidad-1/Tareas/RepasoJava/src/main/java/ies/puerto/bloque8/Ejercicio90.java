package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio90 {

    //Desarrolla un programa que rote una matriz de 3x3, 90º grados en sentido antihorario.


    public static void main(String[] args) {

        introducirValores();
    }


    public static void introducirValores() {

        Scanner sc = new Scanner(System.in);


        int[][] matriz = new int[3][3];

        System.out.println("Ingrese valores para la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la posición " + i + " " + j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz Original: ");
        mostrarMatriz(matriz);

        System.out.println("Matriz rotada: ");
        mostrarMatriz(rotarMatrizAntihorario(matriz));


    }


    public static int[][] rotarMatrizAntihorario(int[][] matriz) {
        int n = matriz.length;


        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matrizRotada[i][j] = matriz[n - j - 1][i];
            }
        }

        return matrizRotada;
    }


    public static void mostrarMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[0].length ; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }


}
