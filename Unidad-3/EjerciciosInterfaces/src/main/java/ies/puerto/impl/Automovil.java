package ies.puerto.impl;

import ies.puerto.abstracta.AutomovilAbstract;
import ies.puerto.interfaz.IConductor;

public class Automovil extends AutomovilAbstract implements IConductor {


    public Automovil(){}

    public Automovil(String marca, String modelo) {
        super(marca, modelo);
    }

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
