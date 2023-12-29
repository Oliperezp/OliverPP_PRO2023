package ies.puerto.bloque4;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {

        //Crea un programa que tome una cadena ingresada por el usuario y verifique si contiene la letra 'a'
        // y muestra un mensaje adecuado.


        Scanner sc = new Scanner(System.in);




        System.out.println("Dame la frase: ");
        String frase= sc.nextLine();

        boolean letraEncontrada = false;

        for (int i = 0; i < frase.length() ; i++) {

             char letra = frase.charAt(i);

         switch (letra){
             case 'a':
              letraEncontrada=true;
              break;

          }



        }
        if(letraEncontrada){
            System.out.println("La letra a esta en el texto");
        }else{
            System.out.println("La letra a no esta en el texto");
        }


    }


}
