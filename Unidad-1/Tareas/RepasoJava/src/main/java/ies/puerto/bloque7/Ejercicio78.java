package ies.puerto.bloque7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio78 {

    //Crea un programa que simule el juego "Piedra, Papel o Tijera" contra la computadora utilizando un bucle do-while.
    // El juego debe continuar hasta que el usuario elija salir.

    public static void main(String[] args) {

        String opcion="";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("¿piedra,papel o tijera?: ");
             opcion=sc.nextLine();
             opcion.toLowerCase();

            String resultado =piedraPapelTijera(opcion);
            System.out.println(resultado);

        }while (!opcion.equals("salir"));

        System.out.println();
        System.out.println("Hasta luego");

    }

    public static String piedraPapelTijera(String opcion){

        Random random = new Random();
        int aleatorio=random.nextInt(3);


        String eleccionOrdenador="";

        switch (aleatorio){
            case 0:
               eleccionOrdenador= "piedra";
               break;
            case 1:
                eleccionOrdenador= "papel";
                break;
            case 2:
                eleccionOrdenador= "tijera";
                break;
            default:
                eleccionOrdenador="";
        }

        System.out.println("El ordenador eligio: " + eleccionOrdenador);

        if(opcion.equals(eleccionOrdenador)){
            return "Es un empate";

        }else if (opcion.equals("papel") && eleccionOrdenador.equals("piedra") ||
                 (opcion.equals("piedra") && eleccionOrdenador.equals("tijera") ||
                 (opcion.equals("tijeras") && eleccionOrdenador.equals("papel")))){
                 return "Tu ganas";

        }else{
            return "El ordenador gana";
        }

    }

}
