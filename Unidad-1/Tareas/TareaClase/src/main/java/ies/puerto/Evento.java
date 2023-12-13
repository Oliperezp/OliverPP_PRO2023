package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Evento {

    public static void main(String[] args) throws ParseException {

    Evento evento1 = new Evento("Concierto");

        System.out.println("Informacion del evento: " + evento1.informacion());

    Evento evento2 = new Evento("Rallye","13/12/2023");

        System.out.println("Informacion del evento: " + evento2.informacion());


    }






 private String nombre;
 private String fecha;

 public Evento(){}


    public Evento(String nombre){

    this.nombre=nombre;

    Calendar calendar = Calendar.getInstance();

    calendar.add(Calendar.MONTH,1);

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    this.fecha = simpleDateFormat.format(calendar.getTime());

    }


    public Evento (String nombre,String fecha){
     this.nombre=nombre;
     this.fecha=fecha;

    }


    public boolean estaProximo() throws ParseException {

     Calendar hoy = Calendar.getInstance();

     hoy.add(Calendar.DAY_OF_MONTH,7);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaEvento = simpleDateFormat.parse(fecha);

        Calendar evento = Calendar.getInstance();
        evento.setTime(fechaEvento);


        Calendar calendarActual = Calendar.getInstance();

        calendarActual.add(Calendar.DAY_OF_MONTH, 7);


        return evento.before(calendarActual.getTime());

    }

    public String informacion() throws ParseException {

      String informacion = "Evento: " + nombre + " Fecha: " + fecha;

       if(estaProximo()){

           informacion+="\n El evento esta proximo";

       }
       return informacion;
    }


}




