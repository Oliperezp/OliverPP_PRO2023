package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * Programa que busca la posicion de fibonacci en un rango dado
     * @param posicion de la escala fibonacci
     * @return el numero de esa posicion en fibonacci
     */
    public static int calcularPosicionFibo(int posicion){

        int numero1 = 1;
        int numero2 = 1;
        int sumaFibonacci=0;


        if(posicion==1 || posicion==2){

            System.out.println("El numero en esa posicion es: 1");
        }


        for (int i = 2; i < posicion; i++) {
            sumaFibonacci = numero1 + numero2; // se suman los dos primeros numeros
            numero1 = numero2; //se convierte el numero1 en el numero 2
            numero2 = sumaFibonacci; //el numero 2 es ahora igual a la suma de los dos numeros sumados




        }
        System.out.println("El numero en esa posicion es :" + sumaFibonacci);

        return sumaFibonacci;

    }



    /**
     * Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.
     * Se debe solicitar el número por teclado.
     *
     * @param args
     */

    /*
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la posicion que quieres: "); //se pide al usuario la posición fibonacci
        int posicion = sc.nextInt(); // se pide la posicion a la que quieres llegar en fibonacci

        calcularPosicionFibo(posicion);


    }
    */

}

