package impl;

import java.util.ArrayList;

public class CompararArrayList {

    public static boolean numerosIguales(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        for (Integer numero : lista1) {
            if (lista2.contains(numero)) {
                return true;
            }
        }
        return false;
    }



}
