package ies.puerto;

public class Bicicleta extends Vehiculo {

    private String talla;

    public Bicicleta(String talla,String color){

        super(color);
        this.talla=talla;

    }




    @Override
    public String toString() {
        return "Mi Bicicleta tiene la talla: " + this.talla + " y tiene el color: " + this.getColor();
    }
}
