package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[] args) {

       //Crea un programa que determine si un año ingresado por el usuario es bisiesto o no
        // (recuerda que un año es bisiesto si es divisible por 4, pero no por 100, o si es divisible por 400).

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa un año te dire si es bisiesto o no: ");
        int anio = sc.nextInt();


        if((anio%4==0 && anio%100!=0) || anio%400==0){

            System.out.println("El año es bisiesto");
        }else {

            System.out.println("El año no es bisiesto");
        }


    }


}
