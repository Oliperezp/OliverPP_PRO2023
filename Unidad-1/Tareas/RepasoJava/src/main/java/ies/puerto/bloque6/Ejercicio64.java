package ies.puerto.bloque6;

import java.util.Scanner;

public class Ejercicio64 {

    //Desarrolla un programa que tome un número ingresado como cadena y lo convierta a un valor entero,
    // luego multiplícalo por 2 y muestra el resultado.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero para multiplicarlo por 2: ");
        String numero=sc.nextLine();

        int resultado=multiplicarNumero(numero);
        System.out.println("El resultado de la multiplicacion es: " +resultado);

    }

    /**
     * Funcion que convierte un numero de String a Int
     * @param numero
     * @return el numero convertido
     */
    public static int convertirAInt(String numero){

        int resultadoInt=Integer.parseInt(numero);

        return resultadoInt;
    }

    /**
     * Funcion multiplica el numero convertido por 2
     * @param numero
     * @return el doble del numero
     */
    public static int multiplicarNumero(String numero){

        int multiplicacion=convertirAInt(numero)*2;

        return multiplicacion;
    }

}
