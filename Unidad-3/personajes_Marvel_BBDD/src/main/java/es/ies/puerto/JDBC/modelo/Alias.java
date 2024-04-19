package es.ies.puerto.JDBC.modelo;

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
}
