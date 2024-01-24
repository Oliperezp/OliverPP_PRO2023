package ies.puerto.bloque10;

public class Ejercicio107 {

    private String nombre;
    private String apellido;
    private int edad;


    public Ejercicio107(){}


    public Ejercicio107(String nombre, String apellido, int edad) {
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

    public void actualizarEdad(int nuevaEdad) {

        edad = nuevaEdad;

        System.out.println("La edad se ha actualizado a " + nuevaEdad + " años.");

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }


    public static void main(String[] args) {



       Ejercicio107 persona = new Ejercicio107("Pedro", "Pérez", 25);
       Ejercicio107 persona2 = new Ejercicio107("Antonio", "Gómez", 30);
       Ejercicio107 persona3  = new Ejercicio107("Maria", "López", 22);

       persona2.actualizarEdad(45);

        System.out.println(persona2.mostrarInformacion());


    }

}
