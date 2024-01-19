package ies.puerto.impl;

import ies.puerto.abstracta.InstrumentoAbstract;

public class Guitarra extends InstrumentoAbstract {


    public Guitarra(){}

    public Guitarra(String nombreInstrumento, String tipo) {
        super(nombreInstrumento, tipo);
    }

    public String cambiarCuerdas(){

        return "Cambiando las cuerdas a la guitarra";

    }




}
