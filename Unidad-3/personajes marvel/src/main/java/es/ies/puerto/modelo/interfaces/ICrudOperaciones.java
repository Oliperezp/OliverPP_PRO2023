package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.Personaje;

import java.util.List;

public interface ICrudOperaciones {
    public List<Personaje> leer();

    public boolean eliminar(String path);

    public boolean existe(String path);

    public boolean actualizar(List<Personaje> personas);

    public boolean escribir(List<Personaje> personas);

    public boolean modificar(List<Personaje> personas);
}

