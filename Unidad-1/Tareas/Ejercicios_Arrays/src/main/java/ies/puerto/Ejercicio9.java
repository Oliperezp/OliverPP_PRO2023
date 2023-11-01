package ies.puerto;

public class Ejercicio9 {


    /**
     * Funcion que combina dos arrays y los muestra
     */
    public void combinarArrays(){

        int[] primerArray={1,2,3};
        int[] segundoArray={4,5,6};

        int[] arraysCombinados=combinarArrays(primerArray,segundoArray);

        for (int i = 0; i <arraysCombinados.length ; i++) {

            System.out.println(i + "");
        }




    }

    /**
     * Funcion que suma el tamaño de los dos arrays unidos y los combina recorriendo los dos arrays
     * @param array1
     * @param array2
     * @return el array resultante unido
     */
    public int[] combinarArrays (int[]array1,int[] array2){

     int tamañoArrayResultante=array1.length+array2.length;

     int[] arrayResultante=new int[tamañoArrayResultante];


        for (int i = 0; i <array1.length ; i++) {

            arrayResultante[i]=i;


        }

        for (int i = 0; i <array2.length ; i++) {

            arrayResultante[i]=i;
        }

        return arrayResultante;
    }

}
