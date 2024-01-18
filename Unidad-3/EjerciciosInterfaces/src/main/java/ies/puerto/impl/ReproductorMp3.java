package ies.puerto.impl;

import ies.puerto.interfaz.IReproductor;

public class ReproductorMp3 implements IReproductor {

    @Override
    public String detener() {
        return "Deteniendo Mp3";
    }

    @Override
    public String reproducir() {
        return "Reproduciendo Mp3";
    }
}

