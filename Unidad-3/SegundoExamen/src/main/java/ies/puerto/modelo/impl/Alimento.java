package ies.puerto.modelo.impl;

import ies.puerto.modelo.impl.abstractas.ProductoFresco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Alimento extends ProductoFresco {

    public Alimento(){}

    public Alimento(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, id, fechaCaducidad);
    }


    /**
     * Funcion que calcula los dias para que un producto se caduque
     * @param fechaCaducidad
     * @param fechaEntrada
     * @return los dias que lleva el producto en la tienda
     * @throws ParseException
     */
    @Override
    public int diasAntesCaducidad(String fechaCaducidad, String fechaEntrada) throws ParseException {

        SimpleDateFormat formatoFechaEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoFechaCaducidad = new SimpleDateFormat("dd/MM/yyyy");

        try{
            Date fechaEntrada1 = formatoFechaEntrada.parse(fechaEntrada);
            Date fechaCaducidad1= formatoFechaCaducidad.parse(fechaCaducidad);

            Calendar fechaEntr = Calendar.getInstance();
            fechaEntr.setTime(fechaEntrada1);
            Calendar fechaCadu = Calendar.getInstance();
            fechaCadu.setTime(fechaCaducidad1);

            long diasCaducados=fechaCadu.getTimeInMillis()-fechaEntr.getTimeInMillis();

            int dias= (int) diasCaducados/(1000*60*60*24);

            return dias;

        }catch (ParseException exception){

            throw new ParseException("No es una fecha valida",exception.getErrorOffset());

        }

    }

    /**
     * Funcion que calcular si un producto esta caducado o no en base a 30 dias
     * @param fechaCaducidad
     * @param fechaEntrada
     * @return true o false si esta caducado
     * @throws ParseException
     */
    @Override
    public boolean caducado(String fechaCaducidad,String fechaEntrada) throws ParseException {
        if(diasAntesCaducidad(fechaCaducidad,fechaEntrada)>30){
            return true;
        }
        return false;
    }

    @Override
    public float precioMaximo() {

        return getPrecio()*1.35f;
    }

    @Override
    public int cantidadDisponible() {

        return 5;
    }
}

