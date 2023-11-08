package ies.puerto;

import static java.lang.Math.PI;

public class Circulo {

    private int radio;

    /**
     * Constructor por defecto
     */
    public Circulo(){}

    /**
     * Constructor de la clase con el radio del circulo
     * @param radio
     */
    public Circulo(int radio) {
        this.radio = radio;
    }


    /**
     * Getter y setters
     */
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }


    /**
     * Funcion para calcular el area de un circulo
     * @return el area del ciruclo
     */
    public double calcularAreaCirculo(int radio){
        return (radio*radio)*PI;

    }

    /**
     * Funcion para calcular la circunferencia de un circulo
     * @return la circunferencia del circulo
     */
    public double calcularCircunferencia(int radio){

        return (radio+radio)*PI;
    }




}
