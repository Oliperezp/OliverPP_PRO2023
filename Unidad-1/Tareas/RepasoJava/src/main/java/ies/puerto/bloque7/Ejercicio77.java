package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio77 {

    //Desarrolla un programa que pida al usuario ingresar cinco notas y calcule el promedio utilizando un bucle for.

    public static void main(String[] args) {
        promedioNotas();
    }

    public static void promedioNotas(){

        double suma=0;
        double promedio=0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Dame la nota numero: " + (i+1));
            double nota=sc.nextDouble();

            suma+=nota;
        }

        promedio=suma/5;

        System.out.println("El promedio de notas del alumnos es: " + promedio);
    }
}
