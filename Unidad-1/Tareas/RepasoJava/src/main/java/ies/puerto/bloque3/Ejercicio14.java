package ies.puerto.bloque3;

import java.util.Scanner;

public class Ejercicio14 {


    //Escribe un programa que utilice una variable booleana para determinar si un número ingresado por el usuario
    // es par o impar.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean esPar;

        System.out.println("Escribe un numero : ");
        int numero = sc.nextInt();



        if(numero%2==0){
            esPar=true;
        }else{
            esPar=false;
        }


        if(esPar){

            System.out.println("El numero ingresado es par");

        }else{
            System.out.println("El numero ingresado es impar");
        }



    }


}
