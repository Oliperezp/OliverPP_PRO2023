package ies.puerto.App;

import ies.puerto.abstracta.PersonaAbstract;
import ies.puerto.impl.Alumno;
import ies.puerto.impl.Profesor;
import ies.puerto.interfaz.ITrabajador;

public class AppPersona {

static Profesor profesor1;

static PersonaAbstract alumno1;


    public static void main(String[] args) {

        profesor1=new Profesor("Paco","24/10/1985",2000f,"Profesor","Matematicas");

        System.out.println(profesor1.toString());
        System.out.println(profesor1.trabajar());
        System.out.println(profesor1.impartirClase());
        System.out.println("Salario: " + profesor1.calcularSalario());

        System.out.println();

        alumno1=new Alumno("Manolo","23/10/2006","1ºESO");
        System.out.println(alumno1.toString());
        System.out.println("Tengo:" + alumno1.anios() + " años");


    }


}
