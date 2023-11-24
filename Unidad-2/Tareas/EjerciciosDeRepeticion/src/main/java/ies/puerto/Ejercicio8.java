package ies.puerto;

public class Ejercicio8 {

    //Escribe un programa que sume todos los números pares del 1 al 10, usando continue para omitir los números impares.


    public static void main(String[] args) {

       int suma=0;
        for (int i = 1; i <=10 ; i++) {

            if(i%2!=0){

                System.out.println("Numero impar encontrado"+" " +"Siguiendo con la siguiente iteracion");
                continue;
            }

            suma+=i;


        }

        System.out.println("Suma de los numeros pares:" + suma);
    }






}
