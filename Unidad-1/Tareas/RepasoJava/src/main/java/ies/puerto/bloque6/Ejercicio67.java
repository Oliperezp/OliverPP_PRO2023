package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio67 {

    //Desarrolla un programa que tome un número decimal, lo convierta a una cadena y muestre cuántos dígitos
    // tiene después del punto decimal.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero: ");
        double numero=sc.nextDouble();


        int resultado=numeroDigitos(numero);

        System.out.println("El numero es: " + convertirAString(numero) + " \n" + "y los digitos despues del punto son: "+
          resultado);
    }


    /**
     * Funcion que convierte un numero en String
     * @param numero
     * @return el numero en String
     */
    public static String convertirAString(double numero){

        String resultadoString=String.valueOf(numero);

        return resultadoString;
    }


    /**
     * Funcion que cuenta cuantos numero hay despues del punto del decimal
     * @param numero
     * @return la cantidad de numeros despues del decimal
     */
    public static int numeroDigitos(double numero){

        String numeroString = convertirAString(numero);

        int indicePunto = numeroString.indexOf('.');

        int digitos = numeroString.length() - indicePunto - 1;


        return digitos;
    }


}
