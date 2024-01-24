package App;

import java.util.ArrayList;
import java.util.List;

import static impl.CompararArrayList.numerosIguales;

public class AppCompararArrayList {

    ArrayList<Integer> numeros1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    ArrayList<Integer> numeros2 = new ArrayList<>(List.of(5, 6, 7, 8, 9));


    boolean numerosIguales = numerosIguales(numeros1, numeros2);

        if (numerosIguales) {
        System.out.println("Las listas tienen al menos un elemento en común.");
    } else {
        System.out.println("Las listas no tienen elementos en común.");
    }
}



