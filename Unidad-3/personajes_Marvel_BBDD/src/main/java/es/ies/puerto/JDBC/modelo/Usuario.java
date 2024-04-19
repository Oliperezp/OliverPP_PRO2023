package es.ies.puerto.JDBC.modelo;

public class Usuario extends Personaje {


    public Usuario(int id) {
        super(id);
    }

    public Usuario(int id, String nombre, String alias, String genero) {
        super(id, nombre,genero);
    }
}
