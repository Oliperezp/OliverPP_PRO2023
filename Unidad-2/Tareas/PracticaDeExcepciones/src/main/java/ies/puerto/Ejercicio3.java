package ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args){


        int[] array = {1, 4, 5};
        exception(array);

    }


    /**
     * Método que recorre un array y lanza una excepcion si sobrepasa del tamaño
     * @param array
     */
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
