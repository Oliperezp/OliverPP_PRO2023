package ies.puerto.modelo.interfaces;

import java.text.ParseException;

public interface ISaludable {

    public int diasAntesCaducidad(String fechaCaducidad,String fechaEntrada) throws ParseException;
    public boolean caducado(String fechaCaducidad,String fechaEntrada) throws ParseException;
}
