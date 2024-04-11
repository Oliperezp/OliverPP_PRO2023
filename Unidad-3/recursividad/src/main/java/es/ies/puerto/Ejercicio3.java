package es.ies.puerto;

public class Ejercicio3 {

    public int sumaNumerosNaturales(int numero){
        int resultado=0;

        for (int i = numero; i >0 ; i--) {
            resultado+=i;
        }
        return resultado;
    }

    public int sumaNumerosNaturalesRecursiva(int numero){

        if(numero==1){
            return 1;
        }
        return numero + sumaNumerosNaturales(numero-1);
    }

}
