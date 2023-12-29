package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero: ");
        int numero=sc.nextInt();

        String resultado=signo(numero);


        System.out.println(resultado);



    }

    /**
     * Funcion que determina el signo de un numero introducido
     * @param numero
     * @return el signo del numero
     */
    public static String signo(int numero){

        int signo = Integer.signum(numero);

        switch (signo){

            case 0:
               return "El numero es 0";

            case 1:
               return "El numero es positivo";

            default:
               return "El numero es negativo";



        }

    }


}
