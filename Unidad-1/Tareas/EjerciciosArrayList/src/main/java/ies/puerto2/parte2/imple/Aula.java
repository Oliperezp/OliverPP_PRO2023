package ies.puerto2.parte2.imple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aula {

    private String nombreAula;
    private Profesor profesor;
    private List<Alumno> alumnos;


    public Aula() {
    }

    public Aula(String nombre, Profesor profesor) {
        this.nombreAula = nombre;
        this.profesor = profesor;
    }

    public Aula(List<Alumno> alumnos) {
        this.alumnos = new ArrayList<>();
    }


    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return Objects.equals(nombreAula, aula.nombreAula) && Objects.equals(profesor, aula.profesor) && Objects.equals(alumnos, aula.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreAula, profesor, alumnos);
    }


    public float calcularPromedioCalificacionesAula() {
        if (alumnos.isEmpty()) {
            return 0;
        }
        float sumaTotal = 0;
        for (Alumno alumno : alumnos) {
            sumaTotal += alumno.calcularPromedioCalificacionesAlumno();

            }
        return sumaTotal / alumnos.size();
        }





    }



