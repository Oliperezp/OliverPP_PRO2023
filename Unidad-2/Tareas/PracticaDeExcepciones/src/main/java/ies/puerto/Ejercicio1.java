package ies.puerto;

import java.util.Scanner;

/**
 * @author Oliver
 */

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {

       int numero1 = solicitarNumero();
       int numero2 = solicitarNumero();
       int resultado = division(numero1,numero2);
        System.out.println("Resultado de la division: "+resultado);

    }

    /**
     * Funcion que realiza la division entre dos numeros
     * @param dividendo de la division
     * @param divisor de la division
     * @return resultado
     */
    public static int division(int dividendo,int divisor) throws Exception{
        int resultado=0;

        try{
            resultado=dividendo/divisor;

        }catch (ArithmeticException exception){
            String mensajeError="Se intenta realizar una division por 0";
            throw new Exception(mensajeError);
        }


        return resultado;
    }

    /**
     * Funcion que pide al usuario un numero
     * @return el numero obtenido
     */
    public static int solicitarNumero(){

        int valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un valor: ");
        valor=sc.nextInt();

        return valor;
    }



}
