package ies.puerto.impl;

import ies.puerto.abstracta.PersonaAbstract;

import java.util.Objects;

public class Persona {

    String dni;
    String nombre;
    String apellido1;
    String apellido2;


    public Persona(){}

    public Persona(String dni, String nombre, String apellido1, String apellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    @Override
    public String toString(){

        return "{Dni: "+dni+" ,Nombre: "+nombre + " Apellido1: " + apellido1 + " Apellido2: " + apellido2 + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
