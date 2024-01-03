package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio79 {

    //Escribe un programa que tome un número entero ingresado por el usuario y cuente cuántos dígitos tiene utilizando un bucle for.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero: ");
        int numero=sc.nextInt();

        int resultado=contarDigitos(numero);
        System.out.println("La cantidad de digitos son: " + resultado);
    }

    public static int contarDigitos(int numero){

        int cantidadNumeros=0;

         String numeroStr=String.valueOf(numero);

        for (int i = 0; i <numeroStr.length() ; i++) {

            cantidadNumeros++;
        }

        return cantidadNumeros;
    }


}
