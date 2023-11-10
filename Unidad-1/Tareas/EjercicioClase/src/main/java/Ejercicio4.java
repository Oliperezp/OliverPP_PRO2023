public class Ejercicio4 {

    private String titular;
    private double saldo;


    /**
     * Constructor por defecto
     */
    public Ejercicio4(){}

    /**
     * Constructor de la clase con el titular y el saldo
     * @param titular de la cuenta
     * @param saldo del titular
     */
    public Ejercicio4(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Funcion que agrega al saldo una cantidad
     * @param deposito
     * @return el saldo
     */
    public double depositarDinero(int deposito){

        boolean agregarDinero = true;

        if(deposito<=0){
            agregarDinero=false;
        }

        saldo+=deposito;

        return saldo;
    }

    /**
     * Funcion que retira del saldo una cantidad
     * @param reintegro
     * @return el saldo
     */
    public double retirarSaldo(int reintegro){

        boolean retiro=true;

        if(reintegro<=0){
            retiro=false;
        }

        saldo-=reintegro;

        return saldo;
    }


    /**
     * Funcion que muestra el titular y el saldo que dispones en ese momento
     * @return el titular y el saldo
     */
    public String mostrarSaldo(){

        return "Titular:" + titular + "Saldo:" + saldo;

    }




}
