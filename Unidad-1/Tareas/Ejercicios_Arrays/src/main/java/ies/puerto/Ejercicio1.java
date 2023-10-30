package ies.puerto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {


    /**
     * Funcion que realiza la suma de los elementos de un array
     * @return el resultado de la suma del array
     */
    public int sumarNumeros(){

        int[] array ={1,2,3,4,5};
        int suma=0;

        for (int i = 0; i < array.length; i++) {

            suma = suma + array[i];

        }
        return suma;
    }


    /**
     * Funcion que muestra el resultado del metodo sumarNumeros
     * @return el resultado de la suma del array
     */
    public int mostrarResultado(){

        int resultado=sumarNumeros();
        System.out.println("El resultado de la suma es " + sumarNumeros());

        return resultado;
    }


}