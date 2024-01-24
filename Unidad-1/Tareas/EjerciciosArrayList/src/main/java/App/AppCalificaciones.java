package App;

import impl.Alumno;

import java.util.ArrayList;
import java.util.List;


public class AppCalificaciones {

    List<Float>calificaciones=new ArrayList<>();

    public static void main(String[] args) {

        Alumno alumno1=new Alumno("Paco","Hernandez",new ArrayList<>(List.of(4.5f,2.4f,1.2f)));


        System.out.println("Promedio de calificaciones de " + alumno1.getNombre() + ": " + alumno1.calcularPromedioCalificaciones());

    }
}
