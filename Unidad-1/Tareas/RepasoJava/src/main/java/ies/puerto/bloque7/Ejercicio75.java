package ies.puerto.bloque7;

public class Ejercicio75 {
    //Haz un programa que utilice un bucle while para imprimir los números pares del 20 al 2 en orden descendente.
    public static void main(String[] args) {

        numerosPares();
    }

    public static void numerosPares(){

        int i=20;
        int ultimo=1;

        while(i!=ultimo){
            if(i%2==0){
                System.out.println(i);
            }
            i--;
        }

    }

}
