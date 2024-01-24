package ies.puerto.bloque10;

public class Ejercicio108 {


    //Desarrolla un método para ordenar un array de objetos Persona por edad, de menor a mayor.



    private String nombre;
    private String apellido;
    private int edad;


    public Ejercicio108(){}


    public Ejercicio108(String nombre, String apellido, int edad) {
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


    public static Ejercicio108[] ordenarArray(Ejercicio108[] personas) {
        int numero = personas.length;

        for (int i = 0; i < numero - 1; i++) {
            for (int j = 0; j < numero - 1 - i; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Ejercicio108 temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }

        return personas;
    }

    public static void main(String[] args) {
        Ejercicio108[] grupoPersonas = {
                new Ejercicio108("Juan", "Pérez", 25),
                new Ejercicio108("Ana", "Gómez", 30),
                new Ejercicio108("Carlos", "López", 22)
        };


        grupoPersonas = ordenarArray(grupoPersonas);

        System.out.println("Información ordenada por edad:");
        for (Ejercicio108 persona : grupoPersonas) {
            System.out.println(persona.mostrarInformacion());
        }
    }
    }



