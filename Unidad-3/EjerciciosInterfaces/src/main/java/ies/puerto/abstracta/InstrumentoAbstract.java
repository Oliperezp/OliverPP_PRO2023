package ies.puerto.abstracta;

import ies.puerto.interfaz.IInstrumentoMusical;

public class InstrumentoAbstract implements IInstrumentoMusical {

    private String nombreInstrumento;
    private String tipo;

    public InstrumentoAbstract(){}

    public InstrumentoAbstract(String nombreInstrumento, String tipo) {
        this.nombreInstrumento = nombreInstrumento;
        this.tipo = tipo;
    }


    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String tocarNota() {
        return "Tocando la nota La";
    }

    @Override
    public String afinar() {
        return "Afinando";
    }
}
