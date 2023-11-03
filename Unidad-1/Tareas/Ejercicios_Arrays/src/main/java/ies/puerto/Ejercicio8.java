package ies.puerto;

public class Ejercicio8 {

     public int[] eliminarDuplicados(){

         int[]arrayOriginal={2,3,7,7,9,3,1,3};
         int tamanioArrayOriginal = arrayOriginal.length;
         int[]arrayResultante = new int[tamanioArrayOriginal];


         for (int i = 0; i <arrayOriginal.length ; i++) {

             for (int j = i+1; j < arrayOriginal.length ; j++) {

                 if(arrayOriginal[i]!=arrayOriginal[j]){

                     arrayOriginal[i]=arrayResultante[j];

                 }

             }



         }

           return arrayResultante;
     }




}
