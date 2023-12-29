package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio49 {

    //Escribe un programa que pida al usuario su edad y determine si es menor de 18, entre 18 y 65 o mayor de 65 años.

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.println(rangoEdad(edad));


    }


    /**
     * Funcion que determina el rango de edad donde estas
     * @param edad
     * @return el mensaje del rango de edad
     */
    public static String rangoEdad(int edad){

        if(edad < 18){
            return ("Eres menor a 18");
        } else if (edad>18 && edad<=65) {
            return ("Tu edad esta entre 18 y 65");
        }else{
          return ("Eres mayor de 65");
        }
    }


}
