package ies.puerto.bloque7;

import java.util.Scanner;

public class Ejercicio73 {

    //Desarrolla un programa que tome una cadena ingresada por el usuario y cuente cuántas vocales (a, e, i, o, u) contiene.
    // Utiliza un bucle while.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase y contare las vocales: ");
        String frase = sc.nextLine();

        int resultado=contarLetras(frase);
        System.out.println("El numero de vocales es: " + resultado);
    }

    public static int contarLetras(String texto){

       int i=0;
       int numeroVocales=0;

        int tamanio=texto.length();

        while(i<tamanio){

           char letra=texto.charAt(i);

           switch (letra){
               case 'a': case'e': case'i': case'o': case'u':case 'A': case'E': case'I': case'O': case'U':
                   numeroVocales++;
           }
           i++;
        }
        return numeroVocales;
    }


}
