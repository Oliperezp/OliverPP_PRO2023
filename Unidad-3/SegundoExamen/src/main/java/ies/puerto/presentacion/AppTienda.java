package ies.puerto.presentacion;

import ies.puerto.modelo.impl.fichero.csv.implementacion.FileCsv;
import ies.puerto.negocio.*;
import ies.puerto.modelo.impl.Alimento;
import ies.puerto.modelo.impl.Aparato;
import ies.puerto.modelo.impl.CuidadoPersonal;
import ies.puerto.modelo.impl.Souvenir;

import java.util.Scanner;

public class AppTienda {


    static Tienda tienda;
    static FileCsv csv;
    static CuidadoPersonal cuidado;

    public static void main(String[] args) {

        tienda = new Tienda();

        tienda.obtenerProductos();




    public static void productosRecomendados(){
           tienda.obtenerProductosPopulares();
              }



    public static void mostrarTotalProductos(){
        System.out.println("Precio total Productos: " +tienda.precioTotalProductos());
    }

    public static void mostrarTotalGanancias(){
        System.out.println("Ganacia total de la tienda:" + tienda.ganaciaTotalTienda());
    }





}
