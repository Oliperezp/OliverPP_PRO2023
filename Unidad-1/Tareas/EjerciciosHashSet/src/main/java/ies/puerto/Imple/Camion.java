package ies.puerto.Imple;

import ies.puerto.Abtracta.Vehiculo;

public class Camion extends Vehiculo {


    public Camion(){

    }

    public Camion(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }


    @Override
    public int velocidadMaxima() {
        return 160;
    }
}
