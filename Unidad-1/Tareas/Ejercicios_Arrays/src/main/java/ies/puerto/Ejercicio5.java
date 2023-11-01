package ies.puerto;

public class Ejercicio5 {


    /**
     * Funcion que busca un numero en un array y te devuelve la posicion de dicho array donde
     * esta ese numero
     * @return la posicion donde esta el numero buscado
     */
    public int buscarElemento(){

        int[] array = {5,6,1,9,20};

        int posicion = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i]==9){
                posicion=i;
            }


        }
        return posicion;
    }



}
