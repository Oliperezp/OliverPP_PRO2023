package es.ies.puerto.modelo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;
import java.util.Objects;

public abstract class Personajes {

    private String nombre;

    private String alias;

    private String genero;

    private List<String> poderes;


    public Personajes() {

    }

    public Personajes(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public Personajes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlias() {
        return alias;
    }

    public String getGenero() {
        return genero;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personajes personaje = (Personajes) o;
        return Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }
}
