package ies.puerto.bloque2;

import java.util.Scanner;

public class Ejercicio6 {

    //Escribe un programa que pida al usuario dos números y luego muestre los dos números y su suma.



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Suma de dos numeros");
        System.out.println();
        System.out.println("Dame el primer numero: ");
        numero1=sc.nextInt();
        System.out.println("Dame el segundo numero: ");
        numero2=sc.nextInt();


        int resultado= numero1+numero2;

        System.out.println("El resultado de la suma de " + numero1 +" y " + numero2 + " es: " + resultado);

    }


}
