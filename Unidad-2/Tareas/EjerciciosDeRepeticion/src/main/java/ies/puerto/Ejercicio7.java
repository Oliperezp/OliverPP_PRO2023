package ies.puerto;

public class Ejercicio7 {

    //Escribe un programa que imprima todos los números impares del 1 al 20, usando continue para omitir los números pares.


    public static void main(String[] args) {

        for (int i = 1; i <=20 ; i++) {

            if(i%2==0){

                System.out.println("Numero par encontrado"+ " " +"Siguiendo con la siguiente iteracion");
                continue;
            }

            System.out.println("Numero impar: " + i);

        }

    }

}
