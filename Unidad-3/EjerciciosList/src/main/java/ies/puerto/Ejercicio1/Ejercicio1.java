package ies.puerto.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    static List<Integer> listaNumerosPares;
    static List<Integer> listaNumerosImpares;


    public static void main(String[] args) {

        listaNumerosPares =new ArrayList<>();
        listaNumerosImpares =new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {

            if(esPar(i)){
                listaNumerosPares.add(i);
            }else{
                listaNumerosImpares.add(i);
            }

        }

        System.out.println("Lista numeros pares: "+listaNumerosPares);
        System.out.println("Tamanio: " + listaNumerosPares.size());
        System.out.println("Lista numeros Impares: "+listaNumerosImpares);
        System.out.println("Tamanio: " + listaNumerosImpares.size());


    }
    /**
     * Funcion que verifica si un numero es Par
     * @param i numero que verifica
     * @return true/false si es par o no
     *
     */
    private static boolean esPar(int i) {


        if (i % 2 == 0) {
            return true;
        }

        return false;
    }
}
