package es.ies.puerto.modelo;

import java.util.List;

public class Usuario extends Personajes {

    public Usuario(String nombre) {
        super(nombre);
    }

    public Usuario(String nombre, String alias, String genero, List<String> poderes) {
        super(nombre, alias, genero, poderes);
    }
}
