package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el factorial de un numero dado por el usuario
 * @author Oliver
 */
public class Ejercicio1 {
    public static void main(String[] args) {



    }

    /**
     * Funcion que calcula el factorial de un numero
     * @param numero de entrada para el calculo
     * @return el factorial de un numero dado por el usuario
     */
    public int calcularFactorial(int numero) {

        int resultado =1;

        for (int i = 2; i <=numero ; i++) {

            resultado*=i;

        }

        return resultado;
    }

}