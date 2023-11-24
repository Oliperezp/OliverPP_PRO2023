package ies.puerto;

public class Ejercicio2 {


    //Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.


    public static void main(String[] args) {


       int contador=0;



        for(int i = 100; i < 200; i++) {

            if (i%i==0) {

                contador++;

            }


            if(contador==2){

                System.out.println("El primer numero primo despues de 100 es: " + i);
            }



            }


        /*

        public boolean esPrimo(int valor){

         for (int i = 2; i < valor ; i++) {

                if(valor%i==0){

                return false;

            }
          return true;

        }


         */



        }











}
