package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio72 {

    //Escribe un programa que solicite al usuario ingresar cinco números y calcule el producto de esos números
    // utilizando un bucle for.


    public static void main(String[] args) {
      solicitarNumeros();
    }

    /**
     * metodo que pide al usuario 5 numeros y los multiplica
     */
    public static void solicitarNumeros(){

        Scanner sc = new Scanner(System.in);
        int multiplicacion=1;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Dame el numero " + (i + 1) + " :");
            int numero=sc.nextInt();
            multiplicacion*=numero;
        }

        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);

    }
}
