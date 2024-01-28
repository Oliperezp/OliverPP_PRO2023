package ies.puerto2.parte2.imple;

import ies.puerto2.parte2.abstracta.Persona;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {


    private List<Float> notas;

    public Alumno(){}

    public Alumno(String nombre, String dni, String fechaNacimiento) {
        super(nombre, dni, fechaNacimiento);

    }

    public Alumno(List<Float> notas) {

        this.notas = new ArrayList<>();
    }


    public ArrayList<Float> getNotas() {
        return (ArrayList<Float>) notas;
    }

    public void setNotas(List<Float> notas) {

        this.notas = notas;
    }

    @Override
    public String toString(){

        try {
            return "Dni: " + getDni() + "Nombre: " + getNombre() + "Fecha Nacimiento: " + getFechaNacimiento() +
                   "Edad: " + anios(getFechaNacimiento());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }





}
