package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        //Desarrolla un programa que determine si un número decimal ingresado por el usuario es positivo, negativo o cero.


        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero: ");
        int numero=sc.nextInt();


        int signo = Integer.signum(numero);

        switch (signo){

            case 0:
                System.out.println("El numero es 0");
                break;
            case 1:
                System.out.println("El numero es positivo");
                break;
            default:
                System.out.println("El numero es negativo");
                break;


        }



    }

}
