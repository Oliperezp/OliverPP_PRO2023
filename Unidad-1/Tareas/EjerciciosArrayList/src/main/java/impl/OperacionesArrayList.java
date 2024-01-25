package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperacionesArrayList {


    public static int empiezaPorA(List<String> cadenas) {
        int contador = 0;
        String regex = "^[aA].*";
        Pattern pattern = Pattern.compile(regex);

        for (String cadena : cadenas) {

            Matcher matcher = pattern.matcher(cadena);
            if (matcher.matches()) {
                contador++;
            }
        }

        return contador;
    }


    //Escribe un método en la clase OperacionesArrayList que reciba un ArrayList de números y devuelva una nueva
    //lista con solo los números pares.


    public static boolean esPar(int i){

        if(i%2==0){
            return true;
        }

        return false;
    }


    //Escribe un método en la clase OperacionesArrayList que reciba un ArrayList de enteros y devuelva
    // true si todos los elementos son mayores que 10. a la lista.

    public static boolean mayoresQueDiez(List<Integer> numero){

        for (Integer numeros:numero) {
            if(numeros>10){
                return true;
            }
        }

        return false;
    }



}
