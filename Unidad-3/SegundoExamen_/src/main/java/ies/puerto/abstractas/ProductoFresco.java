package ies.puerto.abstractas;

import ies.puerto.interfaces.ISaludable;

public abstract class ProductoFresco extends Producto implements ISaludable {


    private String fechaCaducidad;

   public ProductoFresco(){}


    public ProductoFresco(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, id);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", precio: " + getPrecio() + ", fechaEntrada='" + getFechaEntrada() + ", id: "
                + getId() + "Fecha Caducidad: " + fechaCaducidad;
    }

}
