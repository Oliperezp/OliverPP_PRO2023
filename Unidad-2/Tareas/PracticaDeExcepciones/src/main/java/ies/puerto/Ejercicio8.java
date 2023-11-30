package ies.puerto;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {


    //Escribe un programa que solicite al usuario dos números y realice la división.
    // Maneja la excepción InputMismatchException si el usuario ingresa algo que no es un número

    public static void main(String[] args) throws Exception {


            float dividendo = solicitarNumero();
            float divisor = solicitarNumero();

            double resultado = division(dividendo, divisor);

            System.out.println("El resultado de la division es: " + resultado);
    }

    public static float division(float dividendo,float divisor) throws Exception {

        double division = 0;

        if(divisor==0){

            throw new ArithmeticException("No se puede dividir entre 0");
        }
            return  dividendo / divisor;

    }
    public static float solicitarNumero() throws Exception{

        float valor;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Introduzca un valor: ");
            valor=sc.nextFloat();


        }catch (InputMismatchException exception){

            String mensajeError="Error, no has introducido un numero, sino una cadena de texto";
            throw new InputMismatchException(mensajeError);

        }

        return valor;
    }



}
