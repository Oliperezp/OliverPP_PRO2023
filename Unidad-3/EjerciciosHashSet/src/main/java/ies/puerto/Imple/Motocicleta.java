package ies.puerto.Imple;

import ies.puerto.Abtracta.Vehiculo;

public class Motocicleta extends Vehiculo {

 private final int VELOCIDAD_MAXIMA=120;

public Motocicleta(){}


    public Motocicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {
        return VELOCIDAD_MAXIMA;
    }
}
