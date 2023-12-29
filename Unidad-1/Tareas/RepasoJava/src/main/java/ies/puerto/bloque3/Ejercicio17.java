package ies.puerto.bloque3;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        //Crea un programa que tome un número entero y un número decimal ingresados por el usuario y muestre su suma,
        // considerando conversiones necesarias.


        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primero numero entero: ");
        int numero=sc.nextInt();

        System.out.println("Dame el numero decimal: ");
        float numero2=sc.nextFloat();


       float suma = numero+numero2;


        System.out.println("EL resultado de la suma es :" + suma);



    }




}
