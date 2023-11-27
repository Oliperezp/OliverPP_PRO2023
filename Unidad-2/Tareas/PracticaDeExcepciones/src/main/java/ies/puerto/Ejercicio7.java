package ies.puerto;

import java.util.Scanner;

public class Ejercicio7 {


    //Crea un método que acepte un número y maneja la excepción IllegalArgumentException si el número es negativo.

    public static void main(String[] args)throws NumeroNegativoException {

    int numero=solicitarNumero();

    }


    public static int solicitarNumero() throws NumeroNegativoException{

             int valor=0;

            try{

                Scanner sc = new Scanner(System.in);

                System.out.println("Introduzca un numero que no sea negativo: ");
                valor=sc.nextInt();
                validarNumero(valor);


            }catch (IllegalArgumentException exception){

                System.out.println(exception.getMessage());

            }

        return valor;
    }

   public static void validarNumero(int numero) throws NumeroNegativoException{

        if(numero<0){

         throw new NumeroNegativoException("El numero no puede ser negativo");
        }
       System.out.println("El numero es: " + numero);
   }



}
