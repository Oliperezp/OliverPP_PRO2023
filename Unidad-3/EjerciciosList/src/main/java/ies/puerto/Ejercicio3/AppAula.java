package ies.puerto.Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAula {

    static Aula primeroDam;

    public static void main(String[] args) {

        primeroDam=new Aula("1DAM");
        Alumno alumno1=new Alumno("Paco","Martinez", Arrays.asList(1.5f,4.5f,5.5f,3.5f));
        Alumno alumno2=new Alumno("Manolo","Fernandez",Arrays.asList(10f,5f,7f,7f));

        List<Alumno>alumnos=new ArrayList<>();

        alumnos.add(alumno1);
        alumnos.add(alumno2);


        primeroDam.setAlumnos(alumnos);

        System.out.println("Media del Aula 1ºDAM:" +primeroDam.media());

    }



}
