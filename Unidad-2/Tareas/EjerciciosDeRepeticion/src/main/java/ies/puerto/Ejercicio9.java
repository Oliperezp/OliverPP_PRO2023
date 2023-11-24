package ies.puerto;

public class Ejercicio9 {

    //Escribe un programa que busque y cuente los números mayores que 50 en un array, usando continue para omitir
    // los números menores o iguales a 50.

    public static void main(String[] args) {

        int[] numeros = {40, 60, 30, 80, 50, 45, 70};

        for (int num:numeros) {

            if(num<=50){

                System.out.println("Este numero no cumple la condicion");
                continue;

            }

            System.out.println("Es mayor que 50: " +num);
        }



    }




}
