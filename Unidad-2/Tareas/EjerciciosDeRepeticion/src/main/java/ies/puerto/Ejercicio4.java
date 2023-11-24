package ies.puerto;

public class Ejercicio4 {

    //Escribe un programa que encuentre el primer número negativo en un array, utilizando break.

    public static void main(String[] args) {

        int[] arrayNumeros={1,2,3,4,-5,6,7,8,-9,10};


        for (int num: arrayNumeros) {

            if(num<0){

                System.out.println("Encontrado el numero: " + num);
                break;
            }

        }

    }

}
