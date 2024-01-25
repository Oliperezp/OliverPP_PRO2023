package ies.puerto.impl;

import ies.puerto.abstracta.EmpleadoAbstract;

public class Profesor extends EmpleadoAbstract {

    private String especialidad;

    public Profesor(){}

    public Profesor(String nombre, String fechaNacimiento, float salario, String trabajo, String especialidad) {
        super(nombre, fechaNacimiento, salario, trabajo);
        this.especialidad = especialidad;
    }

    @Override
    public float calcularSalario() {
        return getSalario();
    }

    @Override
    public String impartirClase() {
        return "Estoy dando mi clase";
    }

    @Override
    public String toString() {
        return "Nombre del Profesor: " + getNombre() + " FechaNacimiento: " + getFechaNacimiento() + " Años: "
                + anios() + " Salario: " + calcularSalario() + " Trabajo: " + getTrabajo()+" Especialidad: " + especialidad;
    }
}
