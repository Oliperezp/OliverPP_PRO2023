package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio61 {

    //Desarrolla un programa que tome un número entero ingresado por el usuario y
    // lo convierta a una cadena, luego muestre la longitud de esa cadena.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero: ");
        int numero=sc.nextInt();


        String respuesta=convertirAString(numero);
        System.out.println();
        System.out.println("El numero en String es: " + respuesta + "\n" + "y su tamaño es: " + longitudCadena(numero));


    }


    /**
     * Funcion que convierte un numero entero en String
     * @param numero
     * @return el numero en String
     */
    public static String convertirAString(int numero){

        String resultadoString=String.valueOf(numero);

        return resultadoString;
    }

    /**
     * Funcion que mide la longitud del numero en String
     * @param numero
     * @return la longitud del numero
     */
   public static int longitudCadena(int numero){

       int longitud=convertirAString(numero).length();

       return longitud;
   }

}
