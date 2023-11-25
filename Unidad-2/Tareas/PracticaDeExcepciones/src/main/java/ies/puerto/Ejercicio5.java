package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ies.puerto.Ejercicio3.exception;

public class Ejercicio5 {

    public static void main(String[] args) throws Exception {

        //Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc")
        // y trata de evaluarla. Maneja la excepción ArithmeticException u otra excepción adecuada.


        int valor1=solicitarNumero();
        int valor2=solicitarNumero();
        int resultado=sumarNumeros(valor1,valor2);

        System.out.println("El resultado de la suma es: " + resultado);

  }


    public static int sumarNumeros(int valor1,int valor2){

        int suma=0;


            suma=valor1+valor2;

         return suma;
    }

    public static int solicitarNumero() throws Exception{

        int valor;
        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("Introduzca un valor: ");
            valor=sc.nextInt();

        }catch (InputMismatchException exception){

            String mensaje="Error,No se puede sumar un numero y un texto";
            throw new Exception(mensaje);

        }


        return valor;
    }


}
