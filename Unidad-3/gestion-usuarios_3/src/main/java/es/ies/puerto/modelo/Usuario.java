package es.ies.puerto.modelo;

public class Usuario extends Personaje {
    public Usuario(String id) {
        super(id);
    }

    public Usuario(String id, String nombre, int edad, String ciudad) {
        super(id, nombre, edad, ciudad);
    }
}
