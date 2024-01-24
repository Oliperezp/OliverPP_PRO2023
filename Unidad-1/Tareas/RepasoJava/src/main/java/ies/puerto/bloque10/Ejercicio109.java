package ies.puerto.bloque10;

public class Ejercicio109 {

    //Escribe un método que reciba un nombre como parámetro y devuelva una lista de todas las personas con ese nombre.


    private String nombre;
    private String apellido;
    private int edad;


    public Ejercicio109() {
    }


    public Ejercicio109(String nombre, String apellido, int edad) {
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

    public String mostrarInformacion() {

        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad;
    }


    public static Ejercicio109[] buscarNombres(Ejercicio109[] personas, String nombreBuscado) {
        int contador = 0;

  
        for (Ejercicio109 persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombreBuscado)) {
                contador++;
            }
        }

       
        Ejercicio109[] personasConNombre = new Ejercicio109[contador];

      
        int index = 0;
        for (Ejercicio109 persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombreBuscado)) {
                personasConNombre[index++] = persona;
            }
        }

        return personasConNombre;
    }

    public static void main(String[] args) {

        Ejercicio109[] grupoPersonas = {
                new Ejercicio109("Juan", "Pérez", 25),
                new Ejercicio109("Ana", "Gómez", 30),
                new Ejercicio109("Juan", "López", 22)
        };

        String nombreBuscado = "Juan";
        Ejercicio109[] personasConNombre = buscarNombres(grupoPersonas, nombreBuscado);

        System.out.println("Personas con el nombre " + nombreBuscado + ":");
        for (Ejercicio109 persona : personasConNombre) {
            System.out.println(persona.mostrarInformacion());
        }


    }
}