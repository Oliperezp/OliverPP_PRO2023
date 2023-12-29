package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio45 {

    //esarrolla un programa que tome un carácter ingresado por el usuario y determine si es una vocal o una consonante

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa una letra te dire si es vocal o consonante: ");
        String  letra = sc.nextLine();

        String resultado=tipoLetra(letra);
        System.out.println(resultado);


    }

    /**
     * Funcion que mira el tipo de letra que es y la muestra
     * @param letra
     * @return el tipo de letra
     */
    public static String tipoLetra(String letra){

        switch(letra){
            case "a": case "e":case "i": case "o":case "u": case "A":case "E": case "I":case "O": case "U":
                return "Le letra es vocal";

            default:
               return "La letra es consonante";

        }

    }


}
