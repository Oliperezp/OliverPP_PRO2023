package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio38 {

    //Desarrolla un programa que tome dos cadenas ingresadas por el usuario y determine si tienen la misma longitud


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Escribre una frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Dame la segunda frase: ");
        String frase2=sc.nextLine();

        int longitud1 = frase1.length();
        int longitud2 = frase2.length();


        if(longitud1==longitud2){
            System.out.println("Las frases tienen la misma longitud");

        }else {
            System.out.println("Las frases no tienen la misma longitud");
        }


    }

}
