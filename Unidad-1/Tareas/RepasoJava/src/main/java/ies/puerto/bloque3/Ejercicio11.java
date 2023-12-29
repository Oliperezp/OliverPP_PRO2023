package ies.puerto.bloque3;

import java.util.Scanner;

public class Ejercicio11 {

    //Escribe un programa que declare dos variables de tipo entero e imprima su suma, resta, multiplicación y división.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Suma, resta, multiplicacion y division de dos numeros");
        System.out.println();
        System.out.println("Dame el primer numero: ");
        numero1=sc.nextInt();
        System.out.println("Dame el segundo numero: ");
        numero2=sc.nextInt();


        int suma= numero1+numero2;
        int resta=numero1-numero2;
        int multiplicacion=numero1*numero2;
        double division = numero1/numero2;


        System.out.println("El resultado de la suma es: " + suma + "\n" + "El resultado de la resta es: " + resta + "\n"
                + "El resultado de la multiplicacion es: " + multiplicacion + "\n" + "El resultado de la division es: "
                + division);

    }



}



