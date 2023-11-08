package ies.puerto;

import static java.lang.Math.PI;

public class Rectangulo {

    private float ancho;
    private float largo;


    public Rectangulo(){}

    public Rectangulo(float ancho, float largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    /**
     * Funcion para calcular el area de un rectangulo
     * @return el area del rectangulo
     */
    public double calcularAreaRectangulo(float ancho,float largo){
        return largo*ancho;

    }

    /**
     * Funcion para calcular el perimetro de un rectangulo
     * @return el perimetro de un rectangulo
     */
    public double calcularPerimetroRectangulo(float largo,float ancho){

        return (2*largo)+(2*ancho);
    }



}
