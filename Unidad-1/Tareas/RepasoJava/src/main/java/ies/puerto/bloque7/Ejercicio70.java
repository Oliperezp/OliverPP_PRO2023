package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio70 {

    //Desarrolla un programa que pida al usuario ingresar números con un bucle while y calcule
    // la suma de esos números. Termina el bucle cuando la suma alcance o supere 100.

    public static void main(String[] args) {
        sumarNumeros();


    }

    /**
     * Funcion que suma numeros hasta alcanzar 100 o superar 100
     */
    public static void sumarNumeros(){
        Scanner sc = new Scanner(System.in);

        int suma=0;

        while(suma<100){

            System.out.println("Dame un numero para sumarlo: ");
            int numero = sc.nextInt();

            suma+=numero;



        }
        System.out.println("El resultado de la suma es: " + suma);
    }


}
