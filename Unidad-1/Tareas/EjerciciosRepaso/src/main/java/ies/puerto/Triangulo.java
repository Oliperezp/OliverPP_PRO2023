package ies.puerto;

public class Triangulo {

    public static void main(String[] args) {

        int filas = 4;

        for (int i = filas; i >= 1; i--) {
            // Imprime espacios en blanco antes de los asteriscos
            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }

            // Imprime los asteriscos
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    }



