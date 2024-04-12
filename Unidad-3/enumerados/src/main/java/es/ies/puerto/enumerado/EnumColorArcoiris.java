package es.ies.puerto.enumerado;

public enum EnumColorArcoiris {

    ROJO("Rojo"),
    NARANJA("Naranja"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    AZUL("Azul");

    private String valor;

    private EnumColorArcoiris(){}
    private EnumColorArcoiris(final String valor){
        this.valor=valor;

    }



}