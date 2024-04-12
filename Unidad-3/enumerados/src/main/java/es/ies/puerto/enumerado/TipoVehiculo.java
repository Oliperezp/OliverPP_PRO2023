package es.ies.puerto.enumerado;

public enum TipoVehiculo {
    COCHE(1),
    CAMION(2),
    BICI(3);

    int tipo;

    TipoVehiculo(int tipo){
        this.tipo=tipo;
    }

    public int getTipo() {
        return tipo;
    }

}
