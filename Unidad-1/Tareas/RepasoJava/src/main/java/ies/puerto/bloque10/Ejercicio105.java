package ies.puerto.bloque10;

public class Ejercicio105 {

    private String nombre;
    private String apellido;
    private int edad;


    public Ejercicio105(){}


    public Ejercicio105(String nombre, String apellido, int edad) {
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

        Ejercicio104[] personas = new Ejercicio104[3];


        personas[0] = new Ejercicio104("Manolo", "Perez", 45);
        personas[1] = new Ejercicio104("Pedro", "Hernandez", 50);
        personas[2] = new Ejercicio104("Tamara", "Santos", 31);


        for (Ejercicio104 persona : personas) {
            System.out.println(persona.mostrarInformacion());
            System.out.println();
        }
    }




    }



