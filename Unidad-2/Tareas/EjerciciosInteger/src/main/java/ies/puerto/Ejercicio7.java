package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

    //Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos
    // de la clase Integer.


    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Dame un numero y lo convertiré en binario :");
            Integer numero = sc.nextInt();

            String resultado=Integer.toBinaryString(numero);


            System.out.println("El numero " + numero + " en binario es: " + resultado);


        }catch (InputMismatchException exception){
            System.out.println("No se ha introducido un numero sino una cadena de texto");


        }



    }

}
