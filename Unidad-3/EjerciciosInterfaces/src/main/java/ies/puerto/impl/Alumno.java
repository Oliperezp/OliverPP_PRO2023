package ies.puerto.impl;

import ies.puerto.abstracta.PersonaAbstract;

import java.util.Calendar;

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

   /*
 @Override
    public String toString(){
     try {
         return "Nombre: " + getNombre() + " Edad: " + anios() + " Fecha Naciminento: " + getFechaNacimiento() + " Nivel: " +
              nivel;
     } catch (Exception e) {
         throw new RuntimeException(e);
     }
 }

*/



}
