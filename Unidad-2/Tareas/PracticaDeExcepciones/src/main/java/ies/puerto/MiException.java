package ies.puerto;

public class MiException extends Exception{

    int codigoError;

    public MiException(){}

    public MiException(int codigoError){

        this.codigoError=codigoError;

    }

    public MiException(String mensaje){
        super(mensaje);

    }

    public MiException(int codigoError,String mensaje){
     super(mensaje);
     this.codigoError=codigoError;


    }

}
