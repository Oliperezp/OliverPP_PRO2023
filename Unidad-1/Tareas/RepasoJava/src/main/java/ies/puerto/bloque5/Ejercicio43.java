package ies.puerto.bloque5;

import java.util.Scanner;

public class Ejercicio43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el texto: ");
        String texto= sc.nextLine();

        String resultado = encontrarLetra(texto);

        System.out.println(resultado);
    }


    /**
     * Funcion que busca en un texto si se encuentra el caracter a
     * @param texto
     * @return si la letra esta en el texto o no
     */
    public static String encontrarLetra(String texto) {

        boolean letraEncontrada = false;

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            switch (letra) {
                case 'a':
                    letraEncontrada = true;
                    break;

            }


        }
        if (letraEncontrada) {
            return "La letra a esta en el texto";
        } else {
            return "La letra a no esta en el texto";
        }

    }

}
