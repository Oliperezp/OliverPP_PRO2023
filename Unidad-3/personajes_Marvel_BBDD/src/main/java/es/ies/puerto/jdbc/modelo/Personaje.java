package es.ies.puerto.jdbc.modelo;

import java.util.Objects;


public abstract class Personaje {
    private int id;
    private String nombre;
    private String genero;


    public Personaje(int id) {
        this.id = id;
    }

    public Personaje(int id, String nombre, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;


    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return id == personaje.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero;
    }

}
