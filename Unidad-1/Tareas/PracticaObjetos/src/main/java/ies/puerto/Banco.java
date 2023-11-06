package ies.puerto;

import java.awt.image.BaseMultiResolutionImage;

public class Banco {


private String nombreTitular;
private int numeroCuenta;
private double saldo;

    /**
     * Constructor por defecto
     */
    public Banco(){}


    /**
     * Constructor donde se encuentra el numero de cuenta,nombre del titular y su saldo;
     * @param numeroCuenta
     * @param nombreTitular
     * @param saldo
     */
    public Banco(int numeroCuenta, String nombreTitular, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }


    /**
     * Función para agregar saldo
     * @param ingreso
     * @return el saldo que dispones despues del ingreso
     */
    public double agregarSaldo(double ingreso){


     saldo=ingreso+saldo;

     return saldo;
    }


    /**
     * Función que retira saldo de la cuenta
     * @param retiro
     * @return el saldo que dispones despues del reintegro
     */
  public double retirarSaldo(double retiro){

    saldo=saldo-retiro;

    return saldo;
  }


    /**
     * Metodo que muestra tu saldo actual
     * @return el saldo
     */
  public String mostrarSaldoActual(){

   return "Saldo: " + getSaldo();
  }


}
