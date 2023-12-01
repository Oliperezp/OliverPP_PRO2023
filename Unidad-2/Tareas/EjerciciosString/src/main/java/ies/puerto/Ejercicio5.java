package ies.puerto;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Crea un programa que reemplace todas las ocurrencias de una letra específica en una cadena de texto.

        String cadenaTexto = "¿Hola como estAs?";
        String resultado="";

        String textoEnMinisculas = cadenaTexto.toLowerCase();

        for (int i = 0; i <cadenaTexto.length() ; i++) {


            char letra= textoEnMinisculas.charAt(i);

           switch (letra){
               case 'a':
                    resultado = textoEnMinisculas.replace('a','o');
                  break;

           }

        }

        System.out.println(resultado);
    }

}
