package ies.puerto.Persona;

import javax.print.attribute.standard.Destination;

public class Estudiante extends Persona{

    private String curso;
    private double nota;

    public Estudiante(){}


    public Estudiante(String nombre, int edad, String dni, String curso, double nota) {
        super(nombre, edad, dni);
        this.curso = curso;
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Dni: " + getDni() + " Curso: " + this.curso +
                " NotaFinal: " + this.nota;

    }

    @Override
    public String saludar(){
        return "Buenas tardes, ¡soy un estudiante!";
    }

}
