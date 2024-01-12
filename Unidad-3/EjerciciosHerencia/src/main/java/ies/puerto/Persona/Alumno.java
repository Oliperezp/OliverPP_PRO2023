package ies.puerto.Persona;

public class Alumno extends Persona{

private String curso;


public Alumno(){}

public Alumno(String nombre,int edad,String dni,String curso){
    super(nombre,edad,dni);
    this.curso=curso;

}

@Override
public String toString(){
  return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Dni: " + getDni() + " Curso: " + this.curso;

}


}
