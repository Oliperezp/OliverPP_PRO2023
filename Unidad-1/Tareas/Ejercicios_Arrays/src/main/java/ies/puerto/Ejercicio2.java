package ies.puerto;

public class Ejercicio2 {


    public float calcularSuma(){

        float[] array ={1.5f,2.5f,3.5f,4.5f,5.5f};

        float suma=0;


        for (int i = 0; i < array.length; i++) {

            suma = suma + array[i];

        }
       return suma;
    }

    public float calcularPromedio(){

        float[] array ={1.5f,2.5f,3.5f,4.5f,5.5f};

        float promedio;

        promedio=calcularSuma()/array.length;



        return promedio;
    }


}
