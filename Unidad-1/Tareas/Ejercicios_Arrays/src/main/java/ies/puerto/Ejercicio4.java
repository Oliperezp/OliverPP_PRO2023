package ies.puerto;

public class Ejercicio4 {


    /**
     * Funcion que busca los numeros pares detro de un array y despues los muestra con una llamada a la otra funcion
     */
    public void numeroPar() {
        int[] array = {2, 8, 4, 1, 9};
        int[] arrayPares = new int[array.length];
        int posicionParesGuardados = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPares[posicionParesGuardados] = array[i];
                posicionParesGuardados++;
            }
        }


        mostrarArray(arrayPares);
    }

    /**
     * Funcion que muestra el contenido de un array
     * @param array
     */
    public void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}