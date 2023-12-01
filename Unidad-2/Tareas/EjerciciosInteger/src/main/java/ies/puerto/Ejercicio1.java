package ies.puerto;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Crea un programa que tome un número entero como entrada y verifique si es par o impar utilizando
        // los métodos de la clase Integer. Controla las exeption que pudiera generar.

        Integer numero =Integer.valueOf(7);


        int valorInt = numero.intValue();


        if(valorInt%2==0){

            System.out.println("El numero es par");
        }else{

            System.out.println("El numero es Impar");
        }



    }




}
