package ies.puerto.parte1.impl;

import java.util.Objects;

public class Cliente {

    private String nombre;
    private String numero;
    private float saldo;


    public Cliente(){}

    public Cliente(String numero) {
        this.numero = numero;
    }

    public Cliente(String nombre, String numero, float saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void actualizarSaldo(float cantidad){
        this.saldo += cantidad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Float.compare(saldo, cliente.saldo) == 0 && Objects.equals(nombre, cliente.nombre) && Objects.equals(numero, cliente.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero, saldo);
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nombre: " + nombre + '\'' +
                ", numero: " + numero + '\'' +
                ", saldo: " + saldo;
    }
}
