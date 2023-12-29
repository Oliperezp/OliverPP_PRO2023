package ies.puerto.bloque2;

import java.util.Scanner;




public class Ejercicio8 {

    //Crea un programa que tome el radio de un círculo ingresado por el usuario y muestre su área.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float radio;
        double area;

        System.out.println("Area de un Circulo");
        System.out.println();

        System.out.println("Dame el radio del circulo: ");
        radio=sc.nextFloat();

        area=2*3.14159*radio;

        System.out.println("El area del circulo es: " + area);


    }


}
