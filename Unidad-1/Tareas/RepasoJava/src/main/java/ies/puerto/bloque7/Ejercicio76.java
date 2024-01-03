package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio76 {

    //Escribe un programa que solicite al usuario ingresar números positivos utilizando un bucle do-while.
    // El bucle debe continuar hasta que el usuario ingrese un número negativo.
    public static void main(String[] args) {

        ingresarNumeros();
    }

    public static void ingresarNumeros(){

        Scanner sc = new Scanner(System.in);
        boolean terminar=false;

        do{
            System.out.println("Dame un numero saldre si es negativo: ");
            int numero = sc.nextInt();

            if(numero<0){
                terminar=true;
            }

        }while (!terminar);

        System.out.println("Hasta luego");
    }

}
