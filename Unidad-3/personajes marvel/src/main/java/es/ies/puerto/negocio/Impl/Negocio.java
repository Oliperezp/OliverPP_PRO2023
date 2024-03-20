package es.ies.puerto.negocio.Impl;

import es.ies.puerto.modelo.file.FileCsv;
import es.ies.puerto.modelo.file.FileXml;
import es.ies.puerto.modelo.file.FileJson;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.Personaje;
import java.util.List;

import es.ies.puerto.negocio.INegocio;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;

public class Negocio implements INegocio {

    ICrudOperaciones ficheros;
    List<Personaje> personas;
    public Negocio() {
        ficheros = new FileXml();
        personas = ficheros.leer();
    }
    @Override
    /**
     * Obtiene un personaje por su alias
     * @param alias del personaje
     * @return el personaje
     */
    public Personaje obtenerPersonaje(String alias){
        Personaje personajeBuscar = new Personaje(null, alias, null, null);
        if (personas.isEmpty() || !personas.contains(personajeBuscar)) {
            return null;
        }
        int index = personas.indexOf(personajeBuscar);
        return personas.get(index);
    }
    @Override
    /**
     * Agrega una persona nueva
     * @param nombre de la persona
     * @param alias de la persona
     * @param genero de la persona
     * @param poderes de la persona
     * @return
     */
    public boolean agregarPersona(Personaje personaje){
        if (personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }
    @Override
    /**
     * Cambia valores de una persona (buscada por su alias)
     * @param nombre de la persona
     * @param alias de la persona
     * @param genero de la persona
     * @param poderes de la persona
     * @return si se puedo actulizar o no
     */
    public boolean actualizarPersona(Personaje personaje){
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return false;
        }
        personas.remove(personaje);
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }
    @Override
    /**
     * Elimina a una persona
     * @param alias de la persona a eliminar
     * @return si se elimino o no
     */
    public boolean eliminarPersona(String alias){
        Personaje personaje = obtenerPersonaje(alias);
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.remove(personaje);
        return ficheros.actualizar(personas);
    }
    @Override
    /**
     * Muestra todos los personajes de todos los ficheros
     * @return personajes y en que fichero estan
     */
    public String mostrarPersonajesTodosFormatos(){
        StringBuilder stringBuilder = new StringBuilder();
        ICrudOperaciones ficherosMostrar = new FileXml();
        stringBuilder.append("XML:\n").append(ficherosMostrar.leer()).append("\n");
        ficherosMostrar = new FileJson();
        stringBuilder.append("JSON:\n").append(ficherosMostrar.leer()).append("\n");
        ficherosMostrar = new FileCsv();
        stringBuilder.append("CSV:\n").append(ficherosMostrar.leer()).append("\n");
        return stringBuilder.toString();
    }
    /**
     * Obtiene los personajes de el fichero
     * @return
     */
    public List<Personaje> obtenerPersonajes(){
        return ficheros.leer();
    }

    public List<Personaje> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Personaje> personas) {
        this.personas = personas;
        ficheros.actualizar(personas);
    }

}
