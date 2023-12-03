package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Crea un programa que tome un número entero como entrada y verifique si es par o impar utilizando
        // los métodos de la clase Integer. Controla las exeption que pudiera generar.


        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame un numero :");
            Integer numero = sc.nextInt();

            int valorInt = numero.intValue();
            if(valorInt%2==0){

                System.out.println("El numero es par");
            }else{

                System.out.println("El numero es Impar");

            }
        }catch (InputMismatchException exception){
            System.out.println("No ha introducido un numero sino una cadena de texto");
        }









    }




}
