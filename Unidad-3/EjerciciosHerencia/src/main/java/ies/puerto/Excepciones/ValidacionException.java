package ies.puerto.Excepciones;

public class ValidacionException extends Exception{

    private int codigoError;

    public ValidacionException(){}



    public ValidacionException(int codigoError,String mensaje){
        super(mensaje);
        this.codigoError=codigoError;


    }



}
