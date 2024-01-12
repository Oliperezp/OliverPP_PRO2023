package ies.puerto.Vehiculos;

public class Motocicleta extends Vehiculo{

    private String talla;

    public Motocicleta(){}


    public Motocicleta(String marca, String modelo, double precio, String talla) {
        super(marca, modelo, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString(){
        return "Esta Moto es de la marca: " + getMarca() + ",el modelo: " + getModelo() + ",tiene un precio de: " + getPrecio()
                + "y la talla es: " + this.talla;

    }


}
