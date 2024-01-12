package ies.puerto.Vehiculos;

public class Motocicleta extends Vehiculo{

    private String tipoManillar;

    public Motocicleta(){}


    public Motocicleta(String marca, String modelo, double precio, String tipoManillar) {
        super(marca, modelo, precio);
        this.tipoManillar = tipoManillar;
    }

    @Override
    public String toString(){
        return "Esta Moto es de la marca: " + getMarca() + ",el modelo: " + getModelo() + ",tiene un precio de: " + getPrecio()
                + "y tipo de manillar es de: " + this.tipoManillar;

    }


}
