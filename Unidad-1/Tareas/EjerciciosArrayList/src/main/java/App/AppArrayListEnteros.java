package App;

import java.util.ArrayList;
import java.util.List;

public class AppArrayListEnteros {

    //Crea un programa que declare e inicialice un ArrayList de enteros. Luego, agrega números pares del 1 al 10 a la lista.

    static List<Integer> enteros=new ArrayList<>();


    public static void main(String[] args) {


        for (int i = 1; i <= 10 ; i++) {

            enteros.add(i);

        }
        System.out.println(enteros);


    }




}
