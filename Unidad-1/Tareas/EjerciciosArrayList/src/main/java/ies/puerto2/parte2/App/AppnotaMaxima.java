package ies.puerto2.parte2.App;

import ies.puerto.parte1.impl.Alumno;
import ies.puerto2.parte2.abstracta.Persona;
import ies.puerto2.parte2.imple.Aula;
import ies.puerto2.parte2.imple.Colegio;

import java.util.ArrayList;
import java.util.List;

        public class AppnotaMaxima {

            static Persona alumno;
            static Aula aula;
            static Colegio colegio;

    public static void main(String[] args) {




        Alumno alumno1 = new Alumno("Paco","Martinez", new ArrayList<>(List.of(4.5f,2.4f,1.2f)));
        Alumno alumno2 = new Alumno("Antonio","Gonzalez", new ArrayList<>(List.of(4.8f,10f,8f)));
        Alumno alumno3 = new Alumno("Cenutrio","Perez", new ArrayList<>(List.of(4f,2f,1f)));
        Alumno alumno4 = new Alumno("Ana","Hernandez", new ArrayList<>(List.of(6.5f,5f,5f)));
        Alumno alumno5 = new Alumno("Lucia","Mendez", new ArrayList<>(List.of(9f,9.5f,7.5f)));
        //Aula aula1 = new Aula(List.of(alumno1,alumno2,alumno3,alumno4,alumno5));

        System.out.println("La nota Maxima Aula: " );
        System.out.println("Nota maxima en el colegio: " );

    }

}
