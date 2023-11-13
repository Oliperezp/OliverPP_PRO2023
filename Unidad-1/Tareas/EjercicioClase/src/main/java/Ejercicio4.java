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
    public boolean depositarDinero(int deposito){

         if(deposito>0){
            this.saldo+=deposito;
            return true;
        }
        return false;
    }

    /**
     * Funcion que retira del saldo una cantidad
     * @param reintegro
     * @return el saldo
     */
    public boolean retirarSaldo(int reintegro){

         if((this.saldo - reintegro)>0){
            this.saldo-=reintegro;
            return true;
        }
         return false;
    }


    /**
     * Funcion que muestra el titular y el saldo que dispones en ese momento
     * @return el titular y el saldo
     */
    public String mostrarSaldo(){

        return "Titular:" + titular + "Saldo:" + saldo;

    }




}
