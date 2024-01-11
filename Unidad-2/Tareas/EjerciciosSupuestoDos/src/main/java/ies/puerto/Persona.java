package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Persona {

     private String nombre;
     private Date fechaNacimiento;


    public Persona(){

    }

    public Persona(String nombre,Date fechaNacimiento) {

        try{
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            this.nombre=nombre;
            this.fechaNacimiento=fechaNacimiento;

        }catch (Exception exception){

            String mensaje = "No es una fecha válida";

        }

    }





    public static void main(String[] args) {


    }

}
