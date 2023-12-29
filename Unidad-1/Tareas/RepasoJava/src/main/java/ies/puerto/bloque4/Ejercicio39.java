package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio39 {


    //Escribe un programa que pida al usuario su edad y determine si es menor de 18, entre 18 y 65 o mayor de 65 años.
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if(edad < 18){
            System.out.println("Eres menor a 18");
        } else if (edad>18 && edad<=65) {
            System.out.println("Tu edad esta entre 18 y 65");
        }else{
            System.out.println("Eres mayor de 65");
        }


    }
}
