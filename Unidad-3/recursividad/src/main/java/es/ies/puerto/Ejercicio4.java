package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public List<Integer> numerosPares(int numero){
        List<Integer> numerosPares = new ArrayList<>();
        for (int i = 0 ; i<=numero ; i+=2) {
             numerosPares.add(i);
            }
           return numerosPares;
        }

    public List<Integer> numerosParesRecursivo(int numero) {
        List<Integer> numerosPares = new ArrayList<>();
        if(numero%2==0){
            numerosPares.add(numero);
        }
        if(numero==0){
            return numerosPares;
        }
        numerosPares.addAll(numerosParesRecursivo(numero-1));

        return numerosPares;
    }


}




