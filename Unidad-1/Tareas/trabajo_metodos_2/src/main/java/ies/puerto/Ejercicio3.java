package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

//Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números,
// muestra la suma y los muestra en orden creciente y en orden decreciente.


    /**
     * Funcion que realiza la suma de dos valores
     * @param valor1 para calcular la suma
     * @param valor2 para calcular la suma
     * @return la suma de los valores añadidos
     */

    public int suma(int valor1,int valor2){
        return valor1+valor2;
    }
    public int suma(int valor1,int valor2,int valor3){
        int resultado = suma(valor1,valor2);
         return suma(resultado,valor3);
    }
    public int suma(int valor1,int valor2,int valor3,int valor4){
         int resultado=suma(valor1,valor2,valor3);
         return suma(resultado,valor4);
    }
    public int suma(int valor1,int valor2,int valor3,int valor4,int valor5){
        int resultado=suma(valor1,valor2,valor3,valor4);
        return suma(resultado,valor5);
    }


    /**
     * Funcion que determina cual es el mayor de dos numeros
      * @param valor1 para ver cual es el mayor de los dos
     * @param valor2 para ver cual es el mayor de los dos
     * @return el numero mayor
     */
    public int mayor(int valor1,int valor2){
        int resultado= valor1;
        if(valor2>valor1){

            resultado=valor2;
        }
        return resultado;
    }
    public int mayor(int valor1,int valor2,int valor3){
        int resultado=mayor(valor1,valor2);
        return mayor(resultado,valor3);
    }
    public int mayor(int valor1,int valor2,int valor3,int valor4){
        int resultado=mayor(valor1,valor2,valor3);
        return mayor(resultado,valor4);
    }
    public int mayor(int valor1,int valor2,int valor3,int valor4,int valor5){
        int resultado=mayor(valor1,valor2,valor3,valor4);
        return mayor(resultado,valor5);
    }


    /**
     * Funcion que determina el numero menor de dos numeros
     * @param valor1 para calcular cual es el menor
     * @param valor2 para calcular cual es el menor
     * @return el valor menor de los numeros
     */
    public int menor(int valor1,int valor2){
        int resultado= valor1;
        if(valor2<valor1){

            resultado=valor2;
        }
        return resultado;
    }
    public int menor(int valor1,int valor2,int valor3){
        int resultado=mayor(valor1,valor2);
        return mayor(resultado,valor3);
    }
    public int menor(int valor1,int valor2,int valor3,int valor4){
        int resultado=mayor(valor1,valor2,valor3);
        return mayor(resultado,valor4);
    }
    public int menor(int valor1,int valor2,int valor3,int valor4,int valor5){
        int resultado=mayor(valor1,valor2,valor3,valor4);
        return mayor(resultado,valor5);
    }


    /**
     * Funcion que compara y ve cual es el resultado menor
     * @param valor1 para calcular cual es el menor
     * @param valor2 para calcular cual es el menor
     * @return el numero menor de dos numeros
     */

    public int mostrarNumerosCreciente(int valor1,int valor2){
        int valorMenor=menor(3,5);

       return valorMenor;
    }

    public int mostrarNumerosCreciente(int valor1, int valor2,int valor3){

        int resultado=mostrarNumerosCreciente(valor1,valor2);

        return mostrarNumerosCreciente(resultado,valor3);
    }

    public int mostrarNumerosCreciente(int valor1, int valor2,int valor3,int valor4){

        int resultado=mostrarNumerosCreciente(valor1,valor2,valor3);

        return mostrarNumerosCreciente(resultado,valor4);
    }

    public int mostrarNumerosCreciente(int valor1, int valor2,int valor3,int valor4,int valor5){

        int resultado=mostrarNumerosCreciente(valor1,valor2,valor3,valor4);

        return mostrarNumerosCreciente(resultado,valor5);
    }



    /**
     * Funcion que compara y ve cual es el resultado mayor
     * @param valor1 para calcular cual es el mayor
     * @param valor2 para calcular cual es el mayor
     * @return el numero mayor de dos numeros
     */
    public int mostrarNumerosDecreciente(int valor1,int valor2){
        int valorMayor=mayor(3,5);

        return valorMayor;
    }

    public int mostrarNumerosDecreciente(int valor1, int valor2,int valor3){

        int resultado=mostrarNumerosCreciente(valor1,valor2);

        return mostrarNumerosCreciente(resultado,valor3);
    }

    public int mostrarNumerosDecreciente(int valor1, int valor2,int valor3,int valor4){

        int resultado=mostrarNumerosCreciente(valor1,valor2,valor3);

        return mostrarNumerosCreciente(resultado,valor4);
    }

    public int mostrarNumerosDecreciente(int valor1, int valor2,int valor3,int valor4,int valor5){

        int resultado=mostrarNumerosCreciente(valor1,valor2,valor3,valor4);

        return mostrarNumerosCreciente(resultado,valor5);
    }




}

