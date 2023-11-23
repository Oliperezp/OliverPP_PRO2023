package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {


    public void pediNota(){

        Scanner sc = new Scanner(System.in);

        float[] array = new float[5];

         int i=0;
         float nota;

       do{

           System.out.println("Dame la nota: ");
           nota=sc.nextFloat();


           if((nota>=0) && (nota<=10)){

               array[i]=nota;
               nota++;
           }

       }while(nota< array.length);




    }

    /**
     * Funcion que suma todos los valores del array y calcula la nota media
     * @param array
     * @return la nota media
     */
     public float notaMedia(float[] array){

         float media=0;
         float suma=0;

         for (int i = 0; i <array.length ; i++) {

           suma+=array[i];


         }

         media=suma/array.length;


         return media;
     }


     public float notaMasAlta(float[] array){

         float mayor = array[0];

         for (int i = 1; i <array.length ; i++) {

             if(mayor < array[i]){

                 mayor=array[i];
             }


         }

         return mayor;
     }

    public float notaMasBaja(float[] array){

        float menor= array[0];

        for (int i = 1; i <array.length ; i++) {

            if(menor > array[i]){

               menor=array[i];
            }


        }

        return menor;
    }

    public void mostrarArray(float[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }


    }




}
