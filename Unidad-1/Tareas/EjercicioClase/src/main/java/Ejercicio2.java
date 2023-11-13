public class Ejercicio2 {


    /**
     * Funcion que coge un array y lo ordena
     * @return el array ordenado
     */
    public int[] arrayOrdenado(){

        int[] arrayOrdenar={2,1,7,6,8,9,4};
        int[] arrayOrdenado=burbuja(arrayOrdenar);

        return arrayOrdenado;
    }


    /**
     * Funcion que ordena un array con el metodo de la burbuja
     * @param array
     * @return el array ordenado
     */
    public int[] burbuja(int[] array){

        int tamanio = array.length;
        boolean intercambio = false;
        int[] ordenado = new int[tamanio];

        do{

            intercambio=false;

            for (int i = 1; i <tamanio-1; i++) {

                if(array[i-1] > array[i]){

                    int temporal=array[i];

                    array[i]=array[i-1];

                    array[i-1]=temporal;

                    intercambio=true;
                }


            }




        }while(intercambio);






      return array;
    }

}
