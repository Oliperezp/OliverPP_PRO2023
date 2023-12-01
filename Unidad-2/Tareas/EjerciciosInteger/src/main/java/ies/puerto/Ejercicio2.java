package ies.puerto;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Escribe un programa que convierta un número entero en una cadena de texto y
        // viceversa utilizando los métodos de la clase Integer


        Integer numero = 28;
        String numeroStr = "30";

        String resultado =convertirNumeroIntStr(numero);

        int resultado2 =convertirNumeroStrInt(numeroStr);


        System.out.println("Numero en Int: " + resultado);
        System.out.println("Numero en Str: " + resultado2);

    }

    public static String convertirNumeroIntStr(int numero){

        String numeroModificado = Integer.toString(numero);


        return numeroModificado;
    }


    public  static int convertirNumeroStrInt(String numero){

        int numeroModificado=Integer.parseInt(numero);


        return numeroModificado;
    }


}
