package ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args){


        //Declara un array de 3 elementos e intenta acceder al cuarto elemento. Maneja la excepción ArrayIndexOutOfBoundsException.

        int[] array = {1, 4, 5};
        exception(array);

    }


    public static void exception(int[] array) {

        try{

            for (int i = 0; i <=array.length ; i++) {

                System.out.println(array[i]);

            }

        }catch (ArrayIndexOutOfBoundsException exception){

            System.out.println("Error,has excedido del tamaño del array");


        }



    }


}
