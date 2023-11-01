package ies.puerto;

public class Ejercicio7 {


    /**
     * Funcion que ordena los elementos de un array de forma creciente
     * @param array
     */
    public static void ordenarAscendente(int[] array) {

        int[] numeros = {23,33,11,20,19};

               for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
