package ies.puerto2.parte2.imple;

import ies.puerto2.parte2.abstracta.Persona;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {


    private List<Nota> notas;

    public Alumno(){}

    public Alumno(String nombre, String dni, String fechaNacimiento) {
        super(nombre, dni, fechaNacimiento);

    }

    public Alumno(List<Nota> notas) {

        this.notas = new ArrayList<>();
    }


    public ArrayList<Nota> getNotas() {
        return (ArrayList<Nota>) notas;
    }

    public void setNotas(List<Nota> notas) {

        this.notas = notas;
    }



    public float calcularPromedioCalificacionesAlumno() {
        if (notas.isEmpty()) {
            return 0;
        }
        float sumaTotal = 0;
        for (Nota nota: notas) {
              sumaTotal += nota.getValor();

            }
        return sumaTotal / notas.size();
    }
public float notaMaxima(){

        float resultado=0f;

        if(notas.isEmpty()){
            return resultado;
        }

    for (Nota nota :notas){
        if(nota.getValor()> resultado){
            resultado=nota.getValor();
        }
    }

      return  resultado;
}

@Override
public String toString(){
    try {
        return "Nombre: " + getNombre() + "Dni: " + getDni() + "Fecha Nacimiento: " + getFechaNacimiento() +
                "Edad: " + anios(getFechaNacimiento()) + "Notas: " + notas;
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}


}
