package ies.puerto.Imple;

import ies.puerto.Abtracta.Vehiculo;

public class Bicicleta extends Vehiculo {


    public Bicicleta(){

    }

    public Bicicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {
        return 40;
    }
}
