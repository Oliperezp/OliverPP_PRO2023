package ies.puerto;

import com.sun.source.tree.EmptyStatementTree;

import java.sql.SQLOutput;

public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    /**
     * Constructor por defecto
     */
    public Estudiante(){}

    /**
     * Constructor de clase con el nombre,edad,carrera y promedio de notas
     * @param nombre
     * @param edad
     * @param carrera
     * @param promedio
     */
    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }


    public double calcularPromedio(){

        double[] notasAlumno={2.3f,5.6f,6.7f};

        double suma=0;
        for (int i = 0; i < notasAlumno.length; i++) {

            suma+=notasAlumno[i];

        }

         double promedio = 0;

        promedio=suma/notasAlumno.length;

        return promedio;
    }



    public String mostrarInformacionAlumno(){

        calcularPromedio();

      return "Nombre:"+nombre+"Edad:" + edad + "Carrera:" + carrera + "Promedio:" + promedio;
    }


    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Antonio",26,"Fisica",5.5);

        estudiante.calcularPromedio();

        if(estudiante.calcularPromedio()<5) {
            System.out.println("El alumno esta suspendido");
        }else{
            System.out.println("El alumno esta aprobado");
        }
        estudiante.mostrarInformacionAlumno();

    }
}
