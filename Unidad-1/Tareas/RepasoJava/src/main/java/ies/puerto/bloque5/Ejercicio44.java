package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio44 {

    //Escribe un programa que determine si una variable booleana ingresada por el usuario es verdadera o
    // falsa y muestre un mensaje correspondiente.
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa una variable (true o false): ");
        boolean variable = sc.nextBoolean();


        String resultado = esBoleano(variable);

        System.out.println(resultado);




    }

    /**
     * Funcion que compara si la variable es true o false y muestra el mensaje
     * @param variable
     * @return true o false
     */
    public static String esBoleano(boolean variable){

        if(variable){
           return "La variable es verdadera";

        }else{

           return "La variable es falsa";
        }



    }


}
