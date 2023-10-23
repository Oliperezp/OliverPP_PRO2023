package ies.puerto;


import javax.security.sasl.SaslClient;
import java.util.Scanner;


public class Ejercicio2 {

    /**
     * Funcion que chequea se un numero es positivo o negativo
     * @param numero para chequear que el numero es o positivo o negativo
     * @return true o false dependiendo de si el numero es positivo o negativo
     */
    public boolean esPositivoNegativo(int numero) {
        if (numero > 0) {
            return true;
        }
        return false;
    }

    /**
     * Funcion que chequea se un numero es por o Impar
     * @param numero para chequear que el numero es o Par o Impar
     * @return true o false dependiendo de si el numero es par o Impar
     */
    public  boolean esParImpar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    /*
    public  boolean chequearNumero(int numero){
        boolean resultadoParImpar=esParImpar(numero);
        boolean resultado = esPositivoNegativo(numero,resultadoParImpar);

        return resultado;

}
*/






}