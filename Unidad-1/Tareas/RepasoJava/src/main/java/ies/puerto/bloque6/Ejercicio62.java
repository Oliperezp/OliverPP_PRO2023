package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio62 {

    //Crea un programa que tome dos números enteros ingresados por el usuario, realice la suma y muestre el resultado.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        int numero1=sc.nextInt();
        System.out.println("Dame el segundo numero: ");
        int numero2=sc.nextInt();

        int respuesta = sumaNumeros(numero1,numero2);
        System.out.println();
        System.out.println("La suma de los dos numeros es: " + respuesta);


    }

    /**
     * Funcion que suma dos numeros
     * @param numero1
     * @param numero2
     * @return el resultado de la suma
     */
    public static int sumaNumeros(int numero1,int numero2){

        return numero1+numero2;
    }

}
