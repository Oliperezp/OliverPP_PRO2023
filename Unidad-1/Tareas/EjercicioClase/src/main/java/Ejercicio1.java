public class Ejercicio1 {


    /**
     * Funcion que busca un elemento y devuelve la posicion
     * @return la posicion donde esta el elemento
     */
    public int buscarElemento(){
    int[] array ={2,3,4,5,6,7,3,1};

    int elemento = busquedaBinaria(array,7);

    return elemento;
}

    /**
     * Funcion que busca la posicion en un array de un numero especifico
     * @param array
     * @param numero
     * @return
     */
    public int busquedaBinaria(int array[],int numero){

    int comienzo=0;
    int fin = array.length-1;

    while(comienzo <= fin){

       int medio = (comienzo + fin) /2;

       if(array[medio]==numero){
           return medio;

       } else if (array[medio] < numero) {

           comienzo = medio + 1;

       }else{

           fin=medio-1;

       }
    }

    return -1;
}




}
