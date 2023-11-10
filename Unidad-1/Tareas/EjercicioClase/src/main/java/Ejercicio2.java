public class Ejercicio2 {


    /**
     * Funcion que coge un array y lo ordena
     * @return el array ordenado
     */
    public int[] arrayOrdenado(){

        int[] array={2,1,7,6,8,9,4};
        int[] arrayOrdenado=ordenarArray(array);

        return arrayOrdenado;
    }


    /**
     * Funcion que ordena un array con el metodo de la burbuja
     * @param array
     * @return el array ordenado
     */
    public int[] ordenarArray(int array[]){

        int tamanio = array.length;
        boolean ordenado = false;

        do{

            for (int i = 1; i < tamanio-1; i++) {

                if (array[i - 1] > array[i]) {

                    array[i] = array[i - 1];

                    ordenado = true;
                }
                tamanio -= 1;


            }

        }while (ordenado==true);


      return array;
    }

}
