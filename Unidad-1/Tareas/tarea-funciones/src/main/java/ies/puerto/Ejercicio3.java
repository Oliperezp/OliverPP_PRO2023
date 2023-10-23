package ies.puerto;

public class Ejercicio3 {


    /**
     * Funcion que calcula el area de un cuadrado
     * @param a multiplicado por los lados del cuadrado (4 siempre)
     * @return el area del cuadrado
     */
    public int areaCuadrado(int a) {

        return areaRectangulo(a,a);
    }

    /**
     * Funcion que realiza el area de un rectangulo
     * @param a el ladoA del rectangulo
     * @param b el ladoB del rectangulo
     * @return el area del rectangulo
     */
    public int areaRectangulo(int a, int b) {

        return a*b;
    }
}