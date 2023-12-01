package ies.puerto;

public class Ejercicio6 {

    public static void main(String[] args) {

        //Escribe un programa que tome una frase e imprima cada palabra en una nueva línea.

        String frase = "Hola soy Programador";

        String palabra1 = frase.substring(0,4);

        String palabra2 = frase.substring(5,8);

        String palabra3 = frase.substring(9,20);

        System.out.println(palabra1 + "\n" + palabra2 + "\n" + palabra3);



    }


}
