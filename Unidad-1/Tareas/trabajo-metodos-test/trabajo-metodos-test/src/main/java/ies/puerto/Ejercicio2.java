package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el mcd de dos numeros dados
 * @author Oliver
 */
public class Ejercicio2 {
    public static void main(String[] args) {

    }

    /**
     * Funcion que calcula el mcd de dos numeros dados
     * @param numero1 para el calculo
     * @param numero2 pàra el calculo
     * @return mcd de dos numeros dados
     */
    public int mcd(int numero1 , int numero2) {

        int aux;

        while(numero2!=0){

            aux=numero2;
            numero2=numero1%numero2;
            numero1=aux;


        }

        return numero1;
    }

}