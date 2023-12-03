package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        //Escribe un programa que determine si un número entero es positivo, negativo o cero utilizando métodos
        // de la clase Integer.

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Dame un numero te diré si es positivo,negativo, o si es cero :");
            Integer numero = sc.nextInt();

            int resultado=Integer.signum(numero);

            System.out.println("El 1 significa positivo" + "\n" + "El -1 que es negativo" + "\n" + "y el 0 que es un cero");
            System.out.println();
            System.out.println("El numero es :" + resultado);


        }catch (InputMismatchException exception){
            System.out.println("No se ha introducido un numero sino una cadena de texto");


        }









    }



}
