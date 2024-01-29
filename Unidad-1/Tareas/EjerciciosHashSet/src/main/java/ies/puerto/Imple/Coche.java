package ies.puerto.Imple;

import ies.puerto.Abtracta.Vehiculo;

public class Coche extends Vehiculo {

    private final int VELOCIDAD_MAXIMA=180;

    public Coche(){}

    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {
        return VELOCIDAD_MAXIMA;
    }




}
