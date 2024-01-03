package ies.puerto.bloque10;

public class PersonaDos {

    //Añade métodos en la clase Persona para establecer y obtener el nombre, apellido y edad. (Gettes/Setters).
    // Implementa el método main para verificar que funciona correctamente.



    private String nombre;
    private String apellido;
    private int edad;


    public PersonaDos(){}


    public PersonaDos(String nombre, String apellido, int edad) {
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

    public static void main(String[] args) {

        PersonaDos persona = new PersonaDos("Manolo","Perez",45);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());


    }

}
