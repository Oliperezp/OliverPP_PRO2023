package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio68 {

    //Escribe un programa que tome un número entero y un número decimal ingresados por el usuario,
    // los multiplique y muestre el resultado en una cadena junto con un mensaje.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero entero: ");
        int numero=sc.nextInt();
        System.out.println("Dame el numero decimal: ");
        double numero2=sc.nextDouble();

        String resultado = mostrarResultadoString(numero,numero2);

        System.out.println("El resultado de la multiplicacion es: " + resultado);

    }


    /**
     * Funcion que realiza la multiplicacion de dos numeros
     * @param numero
     * @param numero2
     * @return el resultado de la multiplicacion
     */
    public static double multiplicacion(int numero,double numero2){

        return numero*numero2;
    }

    /**
     * Funcion que convierte el resultado de la multiplicacion a String
     * @param numero
     * @param numero2
     * @return el resultado en String
     */
    public static String mostrarResultadoString(int numero,double numero2){

        double resultado = multiplicacion(numero,numero2);
        String resultadoString=String.valueOf(resultado);

        return resultadoString;
    }


}


