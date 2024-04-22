package es.ies.puerto.JPA.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="alias")
public class Alias implements Serializable {

    @Column(name="alias")
private String alias;
    @Column(name="personaje_id")
private int personaje_id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int id;


@OneToMany(mappedBy = "alias")
private Set<Personaje> personajes;



    public Alias(){}

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


}
