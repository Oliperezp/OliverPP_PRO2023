package es.ies.puerto;

public class Ejercicio1 {



    public int factorial(int numero){
        int resultado;
        if(numero==1){
            return 1;
        }
        resultado=numero*factorial(numero-1);


       return resultado;
    }

    public int factorialTradicional(int numero){
        int resultado=1;

        for (int i = 1; i <=numero ; i++) {

            resultado*=i;
        }
        return resultado;
    }


}
