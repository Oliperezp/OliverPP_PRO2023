package ies.puerto.Utilidades;

public class UtilidadesCal {

    private int suma;
    private int resta;
    private double division;
    private int multiplicacion;


    public UtilidadesCal(){}

    public UtilidadesCal(int suma, int resta, double division, int multiplicacion) {
        this.suma = suma;
        this.resta = resta;
        this.division = division;
        this.multiplicacion = multiplicacion;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }


    public int sumar(int numero1,int numero2){


        return numero1+numero2;
    }

    public int restar(int numero1,int numero2){

        return numero1-numero2;
    }

    public double dividir(int dividendo,int divisor){

        return dividendo/divisor;
    }

    public int multiplicacion(int numero1,int numero2){
        return numero1*numero2;
    }

    @Override
    public String toString(){
        return "Operacion";
    }

}
