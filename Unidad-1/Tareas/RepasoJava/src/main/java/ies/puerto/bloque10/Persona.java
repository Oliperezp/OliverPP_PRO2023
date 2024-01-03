package ies.puerto.bloque10;

public class Persona {

    //Crea una clase Persona con atributos como nombre, apellido y edad. Proporciona
    // constructor para inicializar estos atributos. Implementa el método main para verificar que funciona correctamente.

    private String nombre;
    private String apellido;
    private int edad;


    public Persona(){}


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }




    public static void main(String[] args) {

        Persona persona = new Persona("Manolo","Perez",45);


    }


}
