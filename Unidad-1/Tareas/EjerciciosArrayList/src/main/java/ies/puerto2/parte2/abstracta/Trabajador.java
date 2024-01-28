package ies.puerto2.parte2.abstracta;

import java.util.List;

public abstract class Trabajador extends Persona {

private String nombreTrabajador;
private float salario;


public Trabajador(){}


    public Trabajador(String nombreTrabajador, String dni, String fechaNacimiento, String nombre, float salario) {
        super(nombre, dni, fechaNacimiento);
        this.nombreTrabajador = nombre;
        this.salario = salario;
    }


    public String getNombreTrabajador() {
        return nombreTrabajador;
    }


    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public float salarioMinimo(List<Float> salarios){

        if(salarios.isEmpty()){
            return 0;
        }

    float salarioMinimo=Float.MIN_VALUE;

    return salarioMinimo;
    }
    public float salarioMaximo(List<Float> salarios){

    if(salarios.isEmpty()){
        return 0;
    }
       float salarioMaximo=0;
        for (Float salarioProfesor: salarios) {
             salarioMaximo=Float.MAX_VALUE;
        }


        return salarioMaximo;
    }

    public float salarioMedio(List<Float> salarios){

    if(salarios.isEmpty()){
        return 0;
    }

        float suma=0;
        for (Float salarioProfesor: salarios) {
            suma+=salarioProfesor;
        }
        return suma/salarios.size();
    }


}
