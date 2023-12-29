package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {

        //Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura.
        // Luego, pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.


        final int TEMPERATURA_MAXIMA=100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una temperatura: ");
        double temperatura=sc.nextDouble();


        if(temperatura<=TEMPERATURA_MAXIMA && temperatura>=0){
            System.out.println("La temperatura esta en el rango correcto");
        }else{
            System.out.println("La temperatura no esta en el rango correcto");
        }





    }


}
