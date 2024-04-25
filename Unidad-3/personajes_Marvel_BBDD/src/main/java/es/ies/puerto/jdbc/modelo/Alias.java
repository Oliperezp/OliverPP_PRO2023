package es.ies.puerto.jdbc.modelo;

import java.util.Objects;

public class Alias {

private String alias;
private int personaje_id;
private int id;


    public Alias(int id) {
        this.id = id;
    }

    public Alias(String alias, int personaje_id, int id) {
        this.alias = alias;
        this.personaje_id = personaje_id;
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(int personaje_id) {
        this.personaje_id = personaje_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return id == alias.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Alias{" +
                "alias='" + alias + '\'' +
                ", personaje_id=" + personaje_id +
                ", id=" + id +
                '}';
    }
}
