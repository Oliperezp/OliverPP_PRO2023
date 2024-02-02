package ies.puerto.parte1.App;

import ies.puerto.parte1.impl.Alumno;
import ies.puerto.parte1.impl.Curso;

import java.util.ArrayList;
import java.util.List;


public class AppCalificaciones {

    List<Float>calificaciones=new ArrayList<>();

    public static void main(String[] args) {

        Curso curso=new Curso();

        Alumno alumno1=new Alumno("Paco","Hernandez",new ArrayList<>(List.of(4.5f,2.4f,1.2f)));
        Alumno alumno2=new Alumno("Wamedo","Hernandez",new ArrayList<>(List.of(4.5f,2.4f,1.7f)));
        Alumno alumno3=new Alumno("Ambrusio","Hernandez",new ArrayList<>(List.of(10f,2.7f,8f)));



        System.out.println("Promedio de calificaciones de " + alumno1.getNombre() + ": " + alumno1.calcularPromedioCalificaciones());
        System.out.println("Promedio de calificaciones de " + alumno2.getNombre() + ": " + alumno2.calcularPromedioCalificaciones());
        System.out.println("Promedio de calificaciones de " + alumno3.getNombre() + ": " + alumno3.calcularPromedioCalificaciones());

        System.out.println();

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarAlumno(alumno3);

        for (Alumno alumno: curso.getAlumnos()) {

            System.out.println("Lista alumnos:" + alumno.getNombre() + " " + alumno.getApellido());
        }

        curso.eliminarAlumno(alumno2);

        System.out.println();

        for (Alumno alumno: curso.getAlumnos()) {

            System.out.println("Alumnos con uno eliminado:" + alumno.getNombre() + " " + alumno.getApellido());
        }


    }
}
