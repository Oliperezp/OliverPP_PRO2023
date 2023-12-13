package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

    // Implementa un programa que calcule y muestre la suma de los dígitos de un número entero.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero=0;
        System.out.println("Dame un numero para calcular el valor de sus digitos: ");
        numero= sc.nextInt();

        System.out.println("El valor de la suma de sus digitos es: " + sumarDigitos(numero));

    }

    public static int sumarDigitos(int numero){

        int suma = 0;

        String numeroString = Integer.toString(numero);

        for (int i = 0; i < numeroString.length() ; i++) {

            char digito = numeroString.charAt(i);
            int digitoInt = Character.getNumericValue(digito);

            suma+=digitoInt;
        }

       return suma;
    }



}
