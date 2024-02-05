package ies.puerto.abstracta;

import ies.puerto.interfaz.IProducto;

import java.util.Objects;

public abstract class Producto implements IProducto {


    private String nombre;
    private float precio;
    private String fechaEntrada;
    private String udi;


    public Producto(){}

    public Producto(String nombre, float precio, String fechaEntrada, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.udi = udi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Producto producto = (Producto) object;
        return Objects.equals(udi, producto.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", udi='" + udi;
    }
}
