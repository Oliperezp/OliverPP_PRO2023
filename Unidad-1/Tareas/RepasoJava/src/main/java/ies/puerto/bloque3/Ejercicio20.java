package ies.puerto.bloque3;

public class Ejercicio20 {

    public static void main(String[] args) {

    //Crea un programa que declare dos variables booleanas, representando por ejemplo si está lloviendo y si es de noche,
        // y luego utilice operadores lógicos para determinar si se debe encender una lámpara.


        boolean hayLluvia=false;
        boolean esDeNoche=true;


        if(!hayLluvia){
            System.out.println("No hace falta encender una lampara");
        }else{
            System.out.println("Debes encender una lampara");
        }


        if(!esDeNoche){
            System.out.println("La lampara no es necesaria");
        }else{
            System.out.println("Enciende la lampara");
        }


    }



}
