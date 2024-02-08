package ies.puerto.implementacion;

import ies.puerto.abstracta.Producto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Alimento extends Producto {


    public Alimento(){}

    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*0.23f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    public int diasDisponible(String fechaEntrada) throws ParseException {

        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaEntr=Calendar.getInstance();
        Date diaEntrada=simpleDateFormat.parse(fechaEntrada);
        fechaEntr.setTime(diaEntrada);
        Calendar hoy=Calendar.getInstance();
        long diasDesdeEntrada=hoy.getTimeInMillis()-fechaEntr.getTimeInMillis();

        int dias= (int) diasDesdeEntrada/(1000*60*60*24);

        return dias;
    }

    public boolean caducado(String fechaEntrada) throws ParseException {

        if(diasDisponible(fechaEntrada)>30){
            return true;

        }
        return false;
    }



}
