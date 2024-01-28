package ies.puerto2.parte2.abstracta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Persona {

    private String nombre;
    private String dni;
    private String fechaNacimiento;


    public Persona(){}

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreTrabajador) {
        this.nombre = nombreTrabajador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int anios(String fechaNacimiento) throws Exception {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(dni, persona.dni) && Objects.equals(fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, fechaNacimiento);
    }


    public void añadirAnios(String fechaNacimiento,List<Integer> anios) throws Exception {
        anios.add(anios(fechaNacimiento));
    }

    public int edadMedia(List<Integer> anios){

        int suma=0;
        for (Integer listaAnios:anios) {

            suma+=listaAnios;
        }

        return suma/anios.size();
    }




}
