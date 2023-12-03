package ies.puerto;

public class Ejercicio10 {

    public static void main(String[] args) {

        //Escribe un programa que verifique si una cadena de texto puede convertirse en un
        // número entero utilizando métodos de la clase Integer

        String cadenaTexto="1ers5";

        try{

            Integer.parseInt(cadenaTexto);

            System.out.println("La cadena de texto en numero entero es: " + cadenaTexto);

        }catch (NumberFormatException exception){

            System.out.println("La cadena de texto no puede convertirse en entero");

        }





    }

}
