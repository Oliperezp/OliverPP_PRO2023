package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio80 {

    //esarrolla un programa que incluya un bucle while que se ejecute infinitamente. Asegúrate de proporcionar
    // una condición de salida adecuada.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Soy infinito. Ingresa 'salir' para salir.");


            String opcion = sc.nextLine();

            switch (opcion) {
                case "salir":
                    System.out.println("Salgo del bucle, adiós");
                    return;

            }
        }
    }

}
