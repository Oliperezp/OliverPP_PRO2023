package ies.puerto;

public class Ejercicio8 {

    //Escribe un programa que sume todos los números pares del 1 al 10, usando continue para omitir los números impares.


    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {

            if(i%2!=0){

                System.out.println("Numero impar encontrado"+" " +"Siguiendo con la siguiente iteracion");
                continue;
            }

            System.out.println("Numero par: " + i);

        }
    }






}
