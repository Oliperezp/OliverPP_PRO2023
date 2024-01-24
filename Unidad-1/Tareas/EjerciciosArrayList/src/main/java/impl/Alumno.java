package impl;

import java.util.ArrayList;
import java.util.Objects;

public class Alumno {

    private String nombre;
    private String apellido;
    private ArrayList<Float> calificaciones;


    public Alumno(){}

    public Alumno(String nombre, String apellido, ArrayList<Float> calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
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

    public ArrayList<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public float calcularPromedioCalificaciones() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }

        return suma / calificaciones.size();
    }




}



