package ies.puerto.modelo.impl;

import ies.puerto.modelo.impl.abstractas.ProductoRecomendable;

public class CuidadoPersonal extends ProductoRecomendable {

    private int popularidad;

    public CuidadoPersonal(){}

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String id, int popularidad) {
        super(nombre, precio, fechaEntrada, id);
        this.popularidad = popularidad;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public boolean productoRecomendado() {
        if(calcularPopularidad() >= 7){
            return true;
        }
        return false;
    }

    @Override
    public int calcularPopularidad() {

        if(popularidad>=7){
            return popularidad;
        }
        return 0;
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.8f;
    }

    @Override
    public int cantidadDisponible() {

        return 7;
    }


    public String toCsv(){
        return getNombre()+ DELIMITADOR +getPrecio()
                +DELIMITADOR+getFechaEntrada()+DELIMITADOR+
                getId()+DELIMITADOR+popularidad;
    }


}
