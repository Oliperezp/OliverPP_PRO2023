package ies.puerto.Utilidades;

public class AppCalculadora {

    static Calculadora calculadora;


    public static void main(String[] args) {

        calculadora=new Calculadora();
        System.out.println("Resultado suma:" + calculadora.sumar(40,2));

        calculadora=new Calculadora();
        System.out.println("Resultado resta:"+ calculadora.sumar(40,40));

        calculadora=new Calculadora();
        System.out.println("Resultado division:"+ calculadora.dividir(40,40));

        calculadora=new Calculadora();
        System.out.println("Resultado multiplicacion:"+ calculadora.multiplicacion(40,40));




    }



}
