package ies.puerto.bloque3;

public class Ejercicio18 {

    //Escribe un programa que declare una variable double y otra int,
    // luego realiza una conversión explícita de double a int y muestre el resultado.


    public static void main(String[] args) {


       double numeroDouble = 34.67;
       int numero;


        numero= (int) numeroDouble;
        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número decimal en Entero: " + numero);
    }


    }


