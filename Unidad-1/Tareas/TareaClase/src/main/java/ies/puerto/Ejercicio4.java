package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero para convertirlo en binario: ");
        int numero=sc.nextInt();

        System.out.println("El numero en binario es: " + convertirBinario(numero));

    }


    public static String convertirBinario(int numero){

        String resultado = Integer.toBinaryString(numero);


        return resultado;
    }



}
