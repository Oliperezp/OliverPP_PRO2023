public class Ejercicio2 {


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
            ordenado = false;

            for (int i = 0; i < array.length; i++) {

                if(array[i-1] > array[i]){

                    array[i-1]=array[i];
                }

                tamanio-=1;


            }

        }while (ordenado==true);


      return array;
    }

}
