package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Root(name = "personaje")
public class Personaje extends UtilidadesClass {


    @Element(name = "nombre")
    private String nombre;
    @Element(name = "alias")
    private String alias;
    @Element(name = "genero")
    private String genero;
    @ElementList(name = "poderes")
    private List<String>poderes;


    public Personaje() {

    }

    public Personaje(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public Personaje(String nombre) {
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
        Personaje personaje = (Personaje) o;
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

    public String toCsv() {
        return nombre + DELIMITADOR + alias
                + DELIMITADOR + genero + DELIMITADOR + poderes;
    }
}
