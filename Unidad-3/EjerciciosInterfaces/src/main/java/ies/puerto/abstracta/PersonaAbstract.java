package ies.puerto.abstracta;

import java.nio.channels.CancelledKeyException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public  abstract class PersonaAbstract {

    private String nombre;
    private String fechaNacimiento;

    public PersonaAbstract(){}

    public PersonaAbstract(String nombre,String fechaNacimiento){
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public int anios() throws Exception {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Date fechaNac = formatoFecha.parse(fechaNacimiento);
            Calendar calFechaNac = Calendar.getInstance();
            calFechaNac.setTime(fechaNac);

            Calendar hoy = Calendar.getInstance();


            int diferenciaAnio = hoy.get(Calendar.YEAR) - calFechaNac.get(Calendar.YEAR);

            return diferenciaAnio;

        } catch (ParseException e) {

            throw new Exception("No es una fecha valida");

        }
    }




    }



