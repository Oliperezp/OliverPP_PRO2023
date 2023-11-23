package ies.puerto;

public class Ejercicio6 {

    //Escribe un programa que imprima los números del 1 al 20, pero omita la impresión de los números que son múltiplos
    // de 3 utilizando continue.


    public static void main(String[] args) {

        for (int i = 1; i <=20 ; i++) {

            if(i%3==0){

                System.out.println("Numero multiplo de tres encontrado"+"Siguiendo con la siguiente iteracion");
                continue;
            }

            System.out.println("Numero no multiplo de tres" + i);

        }




    }


}
