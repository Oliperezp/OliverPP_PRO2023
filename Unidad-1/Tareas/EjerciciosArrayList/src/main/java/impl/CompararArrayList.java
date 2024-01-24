package impl;

import java.util.ArrayList;

public class CompararArrayList {

    public static boolean numerosIguales(ArrayList<Integer> numeros1, ArrayList<Integer> numeros2) {

        for (int numero : numeros1) {
            if (numeros2.contains(numero)) {
                return true;
            }
        }
        return false;
    }



}
