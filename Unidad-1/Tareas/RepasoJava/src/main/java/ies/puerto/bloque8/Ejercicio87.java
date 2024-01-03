package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio87 {

    public static void main(String[] args) {
      introducirValores();
    }

    public static void introducirValores() {


        Scanner sc = new Scanner(System.in);


        System.out.println("¿Tamaño de las matriz?: ");
        int tamanio = sc.nextInt();

        int[][] matriz = new int[tamanio][tamanio];


        System.out.println("Valores para la matriz");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

                System.out.println("Ingrese el valor de la posicion " + i + " " + j);
                matriz[i][j] = sc.nextInt();
            }


        }

        System.out.println("Matriz Original");
        mostrarMatriz(matriz);

        System.out.println("Traspuesta de la matriz original");
        mostrarMatriz(traspuesta(matriz));

    }


    public static int[][] traspuesta(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length ; j++) {

               matriz[i][j]=matriz[j][i];


            }
        }

        return matriz;
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
