package ies.puerto.bloque7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio71 {

    //Crea un programa que simule un juego de adivinanza. Elige un número aleatorio entre 1 y 10 y
    // pide al usuario que adivine. Utiliza un bucle do-while para continuar el juego hasta que el usuario adivine el número.


    public static void main(String[] args) {

        numeroAleatorio();
    }

    /**
     * Funcion que da un numero aleatorio del 1 al 10 y hay que adivinarlo
     */
    public static void numeroAleatorio(){
        Random random=new Random();
        int aleatorio=random.nextInt(10)+1;

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Adivina el numero del 1 al 10");

        do{


            System.out.println("¿Que numero es?: ");
             numero=sc.nextInt();

             if(numero<1 || numero>10) {
                 System.out.println("No es correcto, ingresa un numero entre 1 y 10: ");
             }else if (numero<aleatorio) {
                 System.out.println("Demasiado bajo: ");
             }else if(numero>aleatorio){
                 System.out.println("Demasiado alto: ");
             }


        }while (numero!=aleatorio);

        System.out.println("¡Felicidades! Has adivinado el numero: " + aleatorio);


    }


}
