package ies.puerto.Persona;

import ies.puerto.acceso.Autentificacion;

public class Persona extends Autentificacion {

    private String nombre;
    private int edad;
    private String dni;


public Persona(){}

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


     @Override
    public String toString(){

    return "Nombre: " + nombre + " Edad: " + edad + " Dni: " + dni;
    }

    public String saludar(){
     return "Hola que tal, soy una Persona";
    }



}
