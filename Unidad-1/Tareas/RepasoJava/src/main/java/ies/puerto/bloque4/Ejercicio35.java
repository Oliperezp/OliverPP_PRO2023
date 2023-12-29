package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {

        //Desarrolla un programa que tome un carácter ingresado por el usuario y determine si es una vocal o una consonante.

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa una letra te dire si es vocal o consonante: ");
        String  letra = sc.nextLine();


        switch(letra){
            case "a": case "e":case "i": case "o":case "u": case "A":case "E": case "I":case "O": case "U":
                System.out.println("Le letra es vocal");
                break;
            default:
                System.out.println("La letra es consonante");
                break;
        }

    }
}
