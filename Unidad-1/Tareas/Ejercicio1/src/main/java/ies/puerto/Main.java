package ies.puerto;


import java.util.Scanner;

/**
 * Clase que realiza el ejercicio numero 1 de la tarea.
 */
public class Main {

    public static void main(String[] args) {

        //Bloque 1 : pide por pantalla y asigna valores

        //Bloque 2: verificia si los valores son iguales

        //Bloque 3: Berifica si A es mayor que B

        Scanner sc = new Scanner(System.in);

        int valorA;
        int valorB;

        System.out.println("Introduzca dos valores distintos");

        do{

            System.out.println("Introduce numero 1:");
            //Se asigna el valor del primero numero
             valorA = sc.nextInt();
            System.out.println("Introduce numero 2:");
            valorB = sc.nextInt();


            if(valorA == valorB){
                System.out.println("Los valores son iguales");
            }

        }while(valorA == valorB);

    if(valorA>valorB){
        System.out.println("El valor"+ valorA + "" + "es el mayor");
    }else{

            System.out.println("El valor"+ valorB + "" + "es el mayor");
        }









    }
}