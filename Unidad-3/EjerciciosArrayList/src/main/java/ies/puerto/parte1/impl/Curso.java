package ies.puerto.parte1.impl;

import java.util.ArrayList;
import java.util.List;

public class Curso {


    private List<Alumno> alumnos;

    public Curso() {
        this.alumnos = new ArrayList<>();
    }

    public List<Alumno> getAlumnos() {

        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {

        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {

        alumnos.add(alumno);
    }


    public void eliminarAlumno(Alumno alumno) {

        alumnos.remove(alumno);
    }


    public float calcularPromedioCalificacionesCurso() {
        if (alumnos.isEmpty()) {
            return 0;
        }

        float sumaTotal = 0;
        for (Alumno alumno : alumnos) {
            ArrayList<Float> calificaciones = alumno.getCalificaciones();
            for (float calificacion : calificaciones) {
                sumaTotal += calificacion;

            }
        }

        return sumaTotal /alumnos.size();
    }


}



