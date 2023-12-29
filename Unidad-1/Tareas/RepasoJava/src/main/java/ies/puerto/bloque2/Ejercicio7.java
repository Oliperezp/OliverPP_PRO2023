package ies.puerto.bloque2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {


        //Desarrolla un programa que solicite al usuario una cantidad en euros y muestre su equivalente en
        // dólares solicitando el valor cambio.

        Scanner sc = new Scanner(System.in);

        double euros;
        double dolares;
        double conversion;

        System.out.println("Conversor de euros € a dolares $");
        System.out.println();

        System.out.println("Dame la cantidad de euros que quieres convertir: ");
        euros=sc.nextDouble();

        conversion=euros/0.91;
        System.out.println();
        System.out.println(euros + " € son: " + conversion + " $");



    }

}
