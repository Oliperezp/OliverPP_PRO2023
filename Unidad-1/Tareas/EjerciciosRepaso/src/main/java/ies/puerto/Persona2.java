package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Persona2 {

   private String nombre;
   private Date fechaNacimiento;


   public Persona2(){}


    public Persona2(String nombre,String fechaNacimiento) throws ParseException{

       this.nombre=nombre;
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

       try{

        this.fechaNacimiento=formato.parse(fechaNacimiento);

       }catch (ParseException exception){

           throw new ParseException("No es una fecha válida",exception.getErrorOffset());

       }


    }

    public int calcularEdad(){

       Calendar fechaNacimientoCal = Calendar.getInstance();
       fechaNacimientoCal.setTime(fechaNacimiento);
       Calendar hoy = Calendar.getInstance();

       int edad = hoy.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);

       return edad;
    }

    public String signoDelZodiaco(){

       Calendar calendar = Calendar.getInstance();

       calendar.setTime(fechaNacimiento);

       int mes = calendar.get(Calendar.MONTH)+1;

       switch(mes){

           case 1:
               return "Capricornio";
           case 2:
               return "Acuario";
           case 3:
               return "Piscis";
           case 4:
               return "Aries";
           case 5:
               return "Tauro";
           case 6:
               return "Géminis";
           case 7:
               return "Cáncer";
           case 8:
               return "Leo";
           case 9:
               return "Virgo";
           case 10:
               return "Libra";
           case 11:
               return "Escorpio";
           case 12:
               return "Sagitario";
           default:
               return "Desconocido";



       }


    }

    public String mostrarInfo(){


       return "Nombre: " + nombre + "\n" + " Fecha De Nacimiento: " +   fechaNacimiento + "\n" + " Edad: " + calcularEdad()
               + "\n" + " Signo Del Zodiaco: " + signoDelZodiaco();
    }


    public static void main(String[] args) throws ParseException {

       Persona2 persona = new Persona2("Paco","22/04/1920");
        System.out.println(persona.mostrarInfo());

    }


}
