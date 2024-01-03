package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio88 {


    //Escribe un programa que multiplique dos matrices de dimensiones 2x3 y 3x2, y muestre el resultado.

    public static void main(String[] args) {

        introducirValores();
    }

    public static void introducirValores() {


        Scanner sc = new Scanner(System.in);


        int[][] matrizUno= new int[2][3];
        int[][] matrizDos= new int[3][2];



        System.out.println("Valores para la matriz Uno");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Ingrese el valor de la posicion " + i + " " + j);
                matrizUno[i][j] = sc.nextInt();
            }


        }
        System.out.println("Valores para la matriz Dos");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println("Ingrese el valor de la posicion " + i + " " + j);
                matrizDos[i][j] = sc.nextInt();
            }


        }

        int[][] resultado=multiplicarMatrices(matrizUno,matrizDos);

        mostrarResultado(resultado);


    }



    public static void mostrarResultado(int[][] matriz){


        System.out.println("El resultado de la multiplicación es:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }




    public static int[][] multiplicarMatrices(int[][] matrizUno, int[][] matrizDos) {
        int filasUno = matrizUno.length;
        int columnasUno = matrizUno[0].length;
        int columnasDos = matrizDos[0].length;

        int[][] resultado = new int[filasUno][columnasDos];

        for (int i = 0; i < filasUno; i++) {
            for (int j = 0; j < columnasDos; j++) {
                for (int k = 0; k < columnasUno; k++) {
                    resultado[i][j] += matrizUno[i][k] * matrizDos[k][j];
                }
            }
        }

        return resultado;
    }


}
