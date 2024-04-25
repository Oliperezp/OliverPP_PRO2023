package es.ies.puerto.jpa.modelo;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;



@Entity
@Table(name="personaje")
public  class Personaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="genero")
    private String genero;


    @ManyToMany(mappedBy = "personajes")
    private Set<Poderes> poderes;

    @ManyToOne
    private Alias alias;


   public Personaje(){}

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


}
