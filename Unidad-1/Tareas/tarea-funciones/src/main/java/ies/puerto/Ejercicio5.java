package ies.puerto;

public class Ejercicio5 {


    /**
     * Funcion que mira si un numero es primo o no
     * @param numero que se introduce para ver si es primo
     * @return false o true dependiendo de si el numero es primo o no
     */
    public boolean numeroPrimo(int numero){


        if(numero<=1){
            return false;
        }

            for(int i=2;i<numero;i++) {
                if(numero%i==0)
                    return false;
            }
            return true;
    }





}