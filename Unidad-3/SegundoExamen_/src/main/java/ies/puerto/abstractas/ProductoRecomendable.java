package ies.puerto.abstractas;

import ies.puerto.interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable {

    public ProductoRecomendable(){}

    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }




}
