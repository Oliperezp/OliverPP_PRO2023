package ies.puerto.Vehiculos;

public class Coche extends Vehiculo {

    private int numeroPlazas;

    public Coche(){}

    public Coche(String marca,String modelo,double precio,int numeroPlazas){
        super(marca, modelo, precio);
        this.numeroPlazas=numeroPlazas;

    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public String toString(){
        return "Coche es de la marca: " + getMarca() + ",el modelo: " + getModelo() + ",tiene un precio de: " + getPrecio()
                + "y el numero de plazas es de: " + this.numeroPlazas;

    }



}
