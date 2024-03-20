package es.ies.puerto.negocio;

import es.ies.puerto.modelo.Personaje;

public interface INegocio {

    public Personaje obtenerPersonaje(String alias);
    public boolean agregarPersona(Personaje personaje);
    public boolean actualizarPersona(Personaje personaje);
    public boolean eliminarPersona(String alias);
    public String mostrarPersonajesTodosFormatos();
}
