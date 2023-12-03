package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        //Implementa un programa que calcule el factorial de un número entero utilizando métodos de la clase Integer.

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Dame un numero te daré su factorial :");
            Integer numero = sc.nextInt();

            int valorInt = numero.intValue();
            int resultado=calcularFactorial(numero);

            System.out.println("El factorial del numero " + numero + " es: " + resultado);



        }catch (InputMismatchException exception){
            System.out.println("No se ha introducido un numero sino una cadena de texto");


        }

    }


    public static int calcularFactorial(int numero){

        int factorial=1;

        for (int i = 1; i <= numero ; i++) {

            factorial*=i;  ;
        }


        return factorial;
    }

}
