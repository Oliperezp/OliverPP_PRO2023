package ies.puerto2.parte2.imple;

import ies.puerto2.parte2.abstracta.Empleado;

import java.util.Objects;

import static java.awt.geom.Path2D.contains;

public class Profesor extends Empleado {

    private String especialidad;


    public Profesor(){}

    public Profesor(String nombre, String dni, String fechaNacimiento, String nombre1, float salario, String especialidad) {
        super(nombre, dni, fechaNacimiento, nombre1, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(especialidad, profesor.especialidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especialidad);
    }


    @Override
   public String toString(){

       try {
           return "Dni: " + getDni() + "Nombre: " + getNombre() + "Fecha Nacimiento: " + getFechaNacimiento() +
                   "Salario: " + getSalario() + "Edad: " + anios(getFechaNacimiento() + "Especialidad:" +
                   especialidad);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }



}
