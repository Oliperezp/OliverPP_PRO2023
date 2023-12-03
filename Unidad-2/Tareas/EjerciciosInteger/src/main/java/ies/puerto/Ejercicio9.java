package ies.puerto;

import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {

        //Crea un programa que genere un número entero aleatorio en un rango específico utilizando métodos
        // de la clase Integer.


        int comienzo=1;
        int fin=100;

        Random random = new Random();

        Integer numeroAleatorio=random.nextInt(fin-comienzo);

        int valorInt=numeroAleatorio.intValue();

        System.out.println("El numero aleatorio es: " + valorInt);


    }

}
