package ies.puerto.modelo.impl;

import ies.puerto.modelo.impl.abstractas.Producto;

public class Aparato extends Producto {

    public Aparato(){}

    public Aparato(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.42f;
    }

    @Override
    public int cantidadDisponible() {
        return 8;
    }
}
