package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de columnas mayor o igual a 4: ");
        int numColumnas = sc.nextInt();


            if (numColumnas < 4) {
                throw new IllegalArgumentException("El número de columnas debe ser igual o mayor a 4.");
            }




    }


}
