package impl;

import java.util.ArrayList;
import java.util.List;

public class CompararArrayList {

    /**
     * Funcion que comprueba si un elemento de una lista existe en otra lista
     *
     * @param lista1 de Integer
     * @param lista2 de Integer
     * @return true o false
     */
    public static boolean numerosIguales(List<Integer> lista1, List<Integer> lista2) {

        if (lista2.size() < lista1.size()) {

            List<Integer> temporal = lista1;
            lista1 = lista2;
            lista2 = temporal;
        }

        for (Integer numero : lista1) {
            if (lista2.contains(numero)) {
                return true;
            }
        }
        return false;
    }

   
}

