package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio74 {
    //Crea un programa que utilice un bucle for para imprimir un triángulo de asteriscos, donde la base del triángulo
    // es ingresada por el usuario.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo: ");
        int base = scanner.nextInt();

        imprimirTriangulo(base);
    }

    public static void imprimirTriangulo(int base){


        for (int i = 1; i <= base; i++) {

            for (int j = 0; j < base - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }



}
