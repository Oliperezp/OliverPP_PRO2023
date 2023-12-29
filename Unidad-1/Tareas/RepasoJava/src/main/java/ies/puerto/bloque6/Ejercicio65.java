package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio65 {

    //Crea un programa que tome un número entero ingresado por el usuario, lo convierta a un valor double y
    // muestre la raíz cuadrada de ese número.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero: ");
        int numero=sc.nextInt();

        double resultado = raizCuadradaNumero(numero);

        System.out.println("El resultado de la raiz cuadrada es: " + resultado);

    }

    /**
     * Funcion que convierte un int en double
     * @param numero
     * @return el numero double
     */
    public static double convertirIntDouble(int numero){

        double resultado=(double) numero;

        return resultado;
    }


    /**
     * Funcion que calcula la raiz cuadrada de un numero
     * @param numero
     * @return el resultado de la raiz cuadrada
     */
    public static double raizCuadradaNumero(int numero){

        double numeroDouble=convertirIntDouble(numero);

        double resultado=Math.sqrt(numeroDouble);

        return resultado;
    }

}
