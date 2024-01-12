package ies.puerto.Persona;

import ies.puerto.Excepciones.ValidacionException;

public class AppPersona {

    static Persona persona;
    static Alumno alumno;
    static Estudiante estudiante;


    public static void main(String[] args) throws ValidacionException {

        persona=new Persona("Paco",14,"78718263G");
        System.out.println(persona.toString());
        System.out.println(persona.validarDni(persona.getDni()));
        System.out.println(persona.validarNombre(persona.getNombre()));
        System.out.println(persona.mayorEdad(persona.getEdad()));
        System.out.println(persona.saludar());

        System.out.println();

        alumno=new Alumno("Federico",13,"45678934t","1ºESO");
        System.out.println(alumno.toString());

        System.out.println();

        estudiante=new Estudiante("Manolo",30,"5467894y","1ºDAM",7);
        System.out.println(estudiante.toString());
        System.out.println(estudiante.validarDni(estudiante.getDni()));
        System.out.println(estudiante.mayorEdad(estudiante.getEdad()));
        System.out.println(estudiante.saludar());

        System.out.println();


    }

}
