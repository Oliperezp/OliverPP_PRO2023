package ies.puerto.parte1.App;

import java.util.ArrayList;
import java.util.List;

import static ies.puerto.parte1.impl.OperacionesArrayList.esPar;
import static ies.puerto.parte1.impl.OperacionesArrayList.mayoresQueDiez;

public class AppArrayListEnteros {

    //Crea un programa que declare e inicialice un ArrayList de enteros. Luego, agrega números pares del 1 al 10 a la lista.

    static List<Integer> enteros=new ArrayList<>();
    static List<Integer> pares=new ArrayList<>();


    public static void main(String[] args) {


        for (int i = 1; i <= 10 ; i++) {

            enteros.add(i);

            if(esPar(i)){
                pares.add(i);
            }

        }


        System.out.println(enteros);
        System.out.println(pares);
        System.out.println("¿Los numeros en el array son todos mayores que diez?: " + mayoresQueDiez(enteros));



    }






}
