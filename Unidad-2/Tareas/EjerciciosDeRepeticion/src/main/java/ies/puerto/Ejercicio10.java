package ies.puerto;

public class Ejercicio10 {

    //Escribe un programa que imprima todos los números positivos en un array, usando continue para omitir
    // los números negativos

    public static void main(String[] args) {

        int[] numeros = {-2, 5, -8, 10, 15, -3, 7};

        for (int num:numeros) {

            if(num<0){

                System.out.println("Es un numero negativo");
                continue;

            }
            System.out.println("Este numero es positivo: " + num);


        }







    }



}
