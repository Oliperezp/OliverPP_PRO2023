package ies.puerto2.parte2.abstracta;

public abstract class Empleado extends Trabajador{


    public Empleado(){}


    public Empleado(String nombre, String dni, String fechaNacimiento, String nombre1, float salario) {
        super(nombre, dni, fechaNacimiento, nombre1, salario);
    }
}
