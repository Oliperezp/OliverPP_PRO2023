package es.ies.puerto.JDBC.modelo;

import java.util.List;
import java.util.Objects;

public class Poderes {

    private int id;
    private List<String> poderes;

    public Poderes(int personaje_id) {
        this.id = id;
    }

    public Poderes(int personaje_id, List<String> poderes) {
        this.id = id;
        this.poderes = poderes;
    }

    public int getId() {
        return id;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poderes poderes1 = (Poderes) o;
        return id == poderes1.id && Objects.equals(poderes, poderes1.poderes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Poderes{" +
                "poderes=" + poderes +
                '}';
    }
}

