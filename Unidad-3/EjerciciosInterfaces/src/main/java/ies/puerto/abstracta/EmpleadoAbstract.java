package ies.puerto.abstracta;

import ies.puerto.interfaz.ITrabajador;

public  abstract class EmpleadoAbstract extends PersonaAbstract implements ITrabajador {

private float salario;
private String trabajo;

public EmpleadoAbstract(){}

    public EmpleadoAbstract(String nombre, String fechaNacimiento, float salario, String trabajo) {
        super(nombre, fechaNacimiento);
        this.salario = salario;
        this.trabajo = trabajo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String trabajar() {
        return "Soy un trabajador y estoy trabajando";
    }

public abstract float calcularSalario();

public abstract String impartirClase();

public abstract String toString();



}
