package ies.puerto.impl;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {


    @Override
    public String arrancar() {
        return "Arrancando el coche";
    }

    @Override
    public String detener() {
        return "Apagando el coche";
    }

    public String conducir(){

        return "El coche esta en movimiento";
    }


}
