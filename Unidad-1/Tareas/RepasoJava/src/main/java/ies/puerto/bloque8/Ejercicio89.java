package ies.puerto.bloque8;

import java.util.Scanner;

public class Ejercicio89 {

    public static void main(String[] args) {

        introducirValores();
    }


    public static void introducirValores() {

        Scanner sc = new Scanner(System.in);


        int[][] matriz = new int[4][4];

        System.out.println("Ingrese valores para la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el valor de la posición " + i + " " + j);
                matriz[i][j] = sc.nextInt();
            }
        }

        numeroMaximo(matriz);

    }

   public static void numeroMaximo(int[][] matriz) {


        int maximo = matriz[0][0];
        int filaMaximo = 0;
        int columnaMaximo = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMaximo = i;
                    columnaMaximo = j;
                }
            }
        }

              System.out.println("El número máximo es " + maximo + " y se encuentra en la posición " + filaMaximo + " " + columnaMaximo + ".");


    }
}



