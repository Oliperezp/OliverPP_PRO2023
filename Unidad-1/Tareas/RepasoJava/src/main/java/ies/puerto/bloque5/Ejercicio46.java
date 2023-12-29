package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio46 {

    //Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura.
    // Luego, pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una temperatura: ");
        double temperatura=sc.nextDouble();

        String resultado=rangoTemperatura(temperatura);
        System.out.println(resultado);

    }

    /**
     * Funcion que determina si la temperatura introducida esta entre 0 y 100
     * @param temperatura
     * @return el mensaje de si esta o no esta en rango
     */
    public static String rangoTemperatura(double temperatura){

        final int TEMPERATURA_MAXIMA=100;

        if(temperatura<=TEMPERATURA_MAXIMA && temperatura>=0){
            return ("La temperatura esta en el rango correcto");
        }else{
           return ("La temperatura no esta en el rango correcto");
        }


    }


}
