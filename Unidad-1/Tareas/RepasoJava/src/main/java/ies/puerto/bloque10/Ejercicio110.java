package ies.puerto.bloque10;

import java.util.regex.Pattern;

public class Ejercicio110 {

    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    public Ejercicio110() {}

    public Ejercicio110(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" + "DNI: " + dni;
    }


    public static boolean validarDni(String dni) {

        String regex = "\\d{8}[a-zA-Z]";
        return Pattern.matches(regex, dni);
    }

    public static void main(String[] args) {

        Ejercicio110 persona = new Ejercicio110("Juan", "Pérez", 25, "78569354g");

        System.out.println("Información de la persona:");
        System.out.println(persona.mostrarInformacion());


        if (validarDni(persona.getDni())) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido.");
        }
    }
}
