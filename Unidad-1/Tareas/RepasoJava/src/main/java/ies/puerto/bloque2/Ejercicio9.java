package ies.puerto.bloque2;

import java.util.Scanner;

public class Ejercicio9 {

    //Escribe un programa que solicite al usuario su edad y luego muestre si es mayor de edad o no.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int edad;

        System.out.println("Dame tu edad: ");
        edad=sc.nextInt();


        if(edad<18){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }






    }

}
