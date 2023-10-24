package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

//Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números,
// muestra la suma y los muestra en orden creciente y en orden decreciente.



    /**
     * Funcion para mostrar los numeros introducidos y sumarlos
     *
     * @param numero1 para calcular la suma y motrarlos
     * @param numero2 para calcular la suma y motrarlos
     * @param numero3 para calcular la suma y motrarlos
     * @param numero4 para calcular la suma y motrarlos
     * @param numero5 para calcular la suma y motrarlos
     * @return la suma de todos los numeros introducidos
     */


    public int sumarCincoNumeros(int numero1, int numero2, int numero3, int numero4, int numero5) {

        System.out.print("Estos son los numeros introducidos: " + numero1+numero2+numero3+numero4+numero5);

        int suma = numero1 + numero2 + numero3 + numero4 + numero5;

        return suma;
    }


    /**
     * Funcion para ordenar los cinco numeros de forma decreciente
     * @param numero1
     * @param numero2
     * @param numero3
     * @param numero4
     * @param numero5
     */
    public void ordenDecreciente (int numero1, int numero2, int numero3, int numero4, int numero5){


               if(numero1>=numero2 && numero2>=numero3 && numero3>=numero4 && numero4>=numero5){

                   System.out.println(" " + numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);

        } else if (numero1<=numero2 && numero2<=numero3 && numero3<=numero4 && numero4<=numero5) {

                   System.out.println(" " + numero5 + " " + numero4 + " " + numero3 + " " + numero2 + " " + numero1);

               } else if (numero1<=numero3 && numero2<=numero3 && numero3<=numero4 && numero4<=numero5) {


               }


    }


}

