package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio37 {
    //Crea un programa que solicite al usuario un número (puede ser entero o decimal) y determine si es divisible por 5

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero (entero o decimal): ");
        double numero=sc.nextDouble();


        if(numero%5==0){

            System.out.println("El numero es divisible entre 5");

        }else{
            System.out.println("El numero no es divisible entre 5");
        }


    }


}
