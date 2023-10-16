package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el calculo del factorial
 * @author Oliver
 */
public class CalculoFactorial {


    /**
     * Metodo que realiza el calculo del factorial
     * @param numero Valor sobre el que se realiza el calculo
     * @return factorial del numero dado
     */
    public static int calculoFactorial(int numero){

     int resultado=1;

        for (int i = 2; i <= numero ; i++) {

            resultado*=i;

        }

     return resultado;
    }



    public static void main(String[] args) {


        int numero = 5;
        System.out.println("Calculando el factorial de: " + numero + "" + "resultado " + "= " + calculoFactorial(numero));


    }






}