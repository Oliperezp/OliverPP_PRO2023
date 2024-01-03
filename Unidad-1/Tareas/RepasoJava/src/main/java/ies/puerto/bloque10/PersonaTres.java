package ies.puerto.bloque10;

public class PersonaTres {

    //Desarrolla un método en la clase Persona para mostrar toda la información de una persona (nombre, apellido y edad).
    // Implementa el método main para verificar que funciona correctamente.

    private String nombre;
    private String apellido;
    private int edad;


    public PersonaTres(){}


    public PersonaTres(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public String mostrarInformacion(){

        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad;
    }


    public static void main(String[] args) {

        PersonaTres persona = new PersonaTres("Manolo","Perez",45);

        System.out.println(persona.mostrarInformacion());


    }


}
