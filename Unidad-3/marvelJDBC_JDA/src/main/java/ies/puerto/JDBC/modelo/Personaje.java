package puerto.modelo;

import java.util.Objects;

public abstract class Personaje {
    private int id;
    private String nombre;
    private String alias;
    private String genero;


    public Personaje(int id) {
        this.id = id;
    }

    public Personaje(int id, String nombre, String alias, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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
                ", alias='" + alias + '\'' +
                ", genero='" + genero;
    }

}
