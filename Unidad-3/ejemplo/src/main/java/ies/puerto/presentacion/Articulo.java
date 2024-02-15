package ies.puerto.presentacion;

import java.util.Objects;

public abstract class Articulo {

    private String nombre;
    private float precio;
    private String fechaEntrada;
    private String id;
    private String fechaCaducidad;


    public Articulo(){}

    public Articulo(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.id = id;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getId() {
        return id;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(id, articulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", id='" + id + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                '}';
    }
}
