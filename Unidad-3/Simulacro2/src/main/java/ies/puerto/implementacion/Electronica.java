package ies.puerto.implementacion;

import ies.puerto.abstracta.Producto;

public class Electronica extends Producto {

    public Electronica(){}

    public Electronica(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }


    @Override
    public float precioMaximo() {
        return getPrecio()*0.6f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
