package ies.puerto.bloque2;

import java.util.Scanner;

public class Ejercicio10 {


    //Desarrolla un programa que tome el precio de un producto ingresado por el usuario y muestre el
    // precio final con el 7% de IGIC incluido

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double precio;
        double impuesto;
        double resultado;

        System.out.println("Dame el precio del articulo: ");
        precio=sc.nextDouble();

        impuesto=precio*0.07;
        resultado=precio+impuesto;

        System.out.println("El precio total con sus impuestos es: " + resultado);


    }


}
