package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {


        //Escribe un programa que compare dos números enteros ingresados por el usuario y muestre cuál es mayor o si son iguales.

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        int numero1=sc.nextInt();
        System.out.println("Dame el numero dos: ");
        int numero2=sc.nextInt();


        int comparacion = Integer.compare(numero1,numero2);

        switch (comparacion){

            case 0:
                System.out.println("Los numeros son iguales");
                break;
            case 1:
                System.out.println("El numero 1 es mayor que numero 2");
                break;
            default:
                System.out.println("El numero 1 es menor que el numero 2");
                break;


        }




    }

}
