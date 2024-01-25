package ies.puerto.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2{

    //Escribe un método en una clase llamada OperacionesArrayList que reciba un ArrayList de cadenas
    // y devuelva la cantidad de elementos que comienzan con la letra 'A'. a la lista.


    static List<String> cadenas;

    public static void main(String[] args) {

        int resultado=0;

        cadenas=new ArrayList<>();
        cadenas.add("Paco");
        cadenas.add("Amapola");
        cadenas.add("Sagitaurio");
        cadenas.add("Amanecer");
        cadenas.add("Soy el mejor");
        cadenas.add("Le vamos a traer dulces");
        cadenas.add("Angelo trae la caja de dulces");

        int contador=0;
        for (String cadena:cadenas) {

            if(comienzaPorA(cadena)){
                contador++;
            }
        }

        System.out.println("La cantidad de palabras con A es: " + contador);

    }

    static public boolean comienzaPorA(String cadena){

        String regex="^[aA].*";

        if(Pattern.matches(regex,cadena)){
            return true;
        }

        return false;

    }









}
