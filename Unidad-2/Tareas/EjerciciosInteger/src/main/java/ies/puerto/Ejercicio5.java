package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Crea un programa que tome dos números enteros como entrada y muestre el máximo común divisor
        // utilizando métodos de la clase Integer.

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Dame el primer numero para el MCD  :");
            Integer numero = sc.nextInt();
            System.out.println();
            System.out.println("Segundo numero :");
            Integer numero2 = sc.nextInt();


            int valorInt=numero.intValue();
            int valorIntDos=numero2.intValue();

            int resultado =mcd(numero,numero2);

            System.out.println("El MCD de " + numero + " y " + numero2 + " es: " + resultado);

        }catch (InputMismatchException exception){
            System.out.println("No se ha introducido un numero sino una cadena de texto");


        }
    }


    /**
     * Funcion para calcular el MCD de dos numeros
     * @param numero1
     * @param numero2
     * @return el MDC
     */
    public static int mcd(int numero1,int numero2){

        int aux;

        while(numero2!=0){
         aux=numero2;
         numero2=numero1%aux;
         numero1=aux;

        }

        return numero1;
    }

}
