package ies.puerto.bloque10;

public class Ejercicio106 {

    //Haz un método que calcule el promedio de edad de un grupo de personas.

    private String nombre;
    private String apellido;
    private int edad;


    public Ejercicio106(){}


    public Ejercicio106(String nombre, String apellido, int edad) {
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

    public static double calcularPromedio(Ejercicio106[] personas) {

        int sumaEdades = 0;

        for (Ejercicio106 persona : personas) {
            sumaEdades += persona.getEdad();
        }

        return (double) sumaEdades / personas.length;
    }


    public static void main(String[] args) {

        Ejercicio106[] grupoPersonas = new Ejercicio106[3];

        grupoPersonas[0] = new Ejercicio106("Pedro", "Pérez", 25);
        grupoPersonas[1] = new Ejercicio106("Antonio", "Gómez", 30);
        grupoPersonas[2] = new Ejercicio106("Maria", "López", 22);

        double promedioEdades = calcularPromedio(grupoPersonas);
        System.out.println("El promedio de edades es: " + promedioEdades);

    }

}