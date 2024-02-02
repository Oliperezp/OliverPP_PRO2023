package ies.puerto.parte1.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ies.puerto.parte1.impl.CompararArrayList.numerosIguales;

public class AppCompararArrayList {

static List<Integer> numeros1;
static List<Integer> numeros2;
    public static void main(String[] args) {
         numeros1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         numeros2 = new ArrayList<>(Arrays.asList(10, 6, 7, 8, 9));

        boolean numerosIguales = numerosIguales(numeros1, numeros2);

        if (numerosIguales) {
            System.out.println("Las listas tienen al menos un elemento en común.");
        } else {
            System.out.println("Las listas no tienen elementos en común.");
        }
    }
}



