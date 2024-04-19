package puerto.modelo;

import java.util.List;
import java.util.Objects;

public class Poderes {

    private int personaje_id;
    private List<String> poderes;

    public Poderes(int personaje_id) {
        this.personaje_id = personaje_id;
    }

    public Poderes(int personaje_id, List<String> poderes) {
        this.personaje_id = personaje_id;
        this.poderes = poderes;
    }

    public int getPersonaje_id() {
        return personaje_id;
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
        return personaje_id == poderes1.personaje_id && Objects.equals(poderes, poderes1.poderes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personaje_id);
    }

    @Override
    public String toString() {
        return "Poderes{" +
                "poderes=" + poderes +
                '}';
    }
}

