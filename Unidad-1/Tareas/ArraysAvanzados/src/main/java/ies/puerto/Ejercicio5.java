package ies.puerto;

import java.lang.reflect.Array;

public class Ejercicio5 {

    public void matrizDiagonalUnos(){

        int[][] matrizDiagonal= new int[5][5];


        for (int i = 0; i <matrizDiagonal.length ; i++) {

            matrizDiagonal[i][i]=1;


        }

       mostrarMatriz(matrizDiagonal);

    }


    public void mostrarMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {

            System.out.println((matriz));

        }

    }



}
