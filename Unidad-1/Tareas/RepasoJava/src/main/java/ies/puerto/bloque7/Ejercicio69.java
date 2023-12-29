package ies.puerto.bloque7;

public class Ejercicio69 {

    //Escribe un programa que utilice un bucle for para imprimir los números pares del 2 al 20.

    public static void main(String[] args) {
       mostrarPares();
    }

    /**
     * Funcion que busca los numero pares en un bucle for
     */
    public static void mostrarPares(){

        for (int i = 2; i <=20 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
