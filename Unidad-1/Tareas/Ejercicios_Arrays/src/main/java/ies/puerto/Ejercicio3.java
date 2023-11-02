package ies.puerto;

public class Ejercicio3 {

    /**
     * Funcion que busca el numero mayor de un array
     * @return el numero mayor del array
     */
    public int numeroMayor(){

        int[] arrayMayor = {2,8,4,1,9};

        int mayor = arrayMayor[0];
        for (int i = 1; i < arrayMayor.length; i++) {

         if(arrayMayor[i]>mayor){

             mayor=arrayMayor[i];
         }

        }

        return mayor;
    }

    /**
     * Funcion que busca el numero menor de un array
     * @return el numero menor del array
     */
    public int numeroMenor(){

        int[] arrayMenor = {2,8,4,1,9};

        int menor = arrayMenor[0];
        for (int i = 1; i < arrayMenor.length; i++) {

            if(arrayMenor[i]<menor){

                menor=arrayMenor[i];
            }

        }

        return menor;
    }



}
