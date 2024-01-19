package ies.puerto.impl;

import ies.puerto.abstracta.PersonaAbstract;

public class Alumno extends PersonaAbstract {

   private String nivel;

   public Alumno(){}

    public Alumno(String nombre, String fechaNacimiento, String nivel) {
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    public String estudiar(){
       return "Voy a Estudiar";
   }

 @Override
    public String toString(){
       return "Nombre: " + getNombre() + " Edad: " + anios() + " Fecha Naciminento: " + getFechaNacimiento() + " Nivel: " +
            nivel;
 }





}
