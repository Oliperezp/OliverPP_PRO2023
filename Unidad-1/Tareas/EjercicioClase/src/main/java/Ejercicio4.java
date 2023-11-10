public class Ejercicio4 {

    private String titular;
    private double saldo;


    public Ejercicio4(){}

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

    public double depositarDinero(int deposito){

        boolean agregarDinero = true;

        if(deposito<0){
            agregarDinero=false;
        }

        saldo+=deposito;

        return saldo;
    }

    public double retirarSaldo(int reintegro){

        boolean retiro=true;

        if(reintegro<0){
            retiro=false;
        }

        saldo-=reintegro;

        return saldo;
    }

    public String mostrarSaldo(){

        return "Saldo:" + saldo;

    }




}
