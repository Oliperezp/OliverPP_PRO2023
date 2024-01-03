package ies.puerto.bloque10;

public class Ejercicio104 {

    //Escribe un método en la clase Persona para comparar la edad de dos personas y determinar cuál es mayor.
    // Implementa el método main para verificar que funciona correctamente.


    private String nombre;
    private String apellido;
    private int edad;


    public Ejercicio104(){}


    public Ejercicio104(String nombre, String apellido, int edad) {
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

    public String compararEdad(Ejercicio104 otraPersona) {

        if (this.edad > otraPersona.getEdad()) {
            return this.nombre + " es mayor que " + otraPersona.getNombre();
        } else if (this.edad < otraPersona.getEdad()) {
            return this.nombre + " es menor que " + otraPersona.getNombre();
        } else {
            return this.nombre + " tiene la misma edad que " + otraPersona.getNombre();
        }
    }

    public static void main(String[] args) {

        Ejercicio104 persona = new Ejercicio104("Manolo","Perez",45);
        Ejercicio104 personaDos = new Ejercicio104("Pedro","Hernandez",50);

        String comparacion=persona.compararEdad(personaDos);

        System.out.println(comparacion);



    }

}
