package es.ies.puerto.jpa.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="poderes")
public class Poderes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="poder")
    private String poder;

    @ManyToMany
    private Set<Personaje> personajes;


    public Poderes(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poderes poderes = (Poderes) o;
        return id == poderes.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

