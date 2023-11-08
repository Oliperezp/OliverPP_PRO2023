package ies.puerto;

import java.util.Arrays;

public class ArraysUnidos {

    int[] primerArray = {3,2,5,7,8};
    int[] segundoArray ={5,8,2,4,1};


    public int[] arraysUnidosOrdenados(){

        int[] arrayresultante=unirArrays(primerArray,segundoArray);

        Arrays.sort(arrayresultante);

        eliminarDuplicados(arrayresultante);

        return arrayresultante;
    }


    public int[] unirArrays(int array1[],int array2[]){

        int tamanioArrayResultante=array1.length + array2.length;

        int[] resultante = new int[tamanioArrayResultante];


        for (int i = 0; i <array1.length ; i++) {

            resultante[i]=array1[i];

        }

        for (int i = 0; i <array2.length ; i++) {

            resultante[array1.length+i]=array2[i];
        }


       return resultante;
    }

    public int[] eliminarDuplicados(int array[]){

        int tamanioArrayOriginal = array.length;
        int[]arrayResultante = new int[tamanioArrayOriginal];

        for (int i = 0; i <array.length ; i++) {

            for (int j = i+1; j <array.length ;j++) {

               if(array[i]!=array[j]){

                   array[j]=arrayResultante[i];
               }


            }


        }

        return arrayResultante;
    }


}
