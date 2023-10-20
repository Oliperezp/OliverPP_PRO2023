package ies.puerto;

public class Ejercicio6 {

    /**
     * recorrer un rango de numeros (1..1000)
     * para un numero comprobar si es Amstrong
     * Si es imprime en pantalla
     * si no sigue adelante
     */


     /**
     * Funcion que verifica si un numero es Armstrong
     * @param numero para realizar la verificacion
     * @return un boolean true o false con el resultado
     */
    public boolean verificarArmstrong(int numero){

        boolean resultado = false;

        int digitos = 0;
        int calculoDigitos=numero;

        while(calculoDigitos>0){

            calculoDigitos/=10;
            digitos++;


        }

        int resto=0;
        calculoDigitos=numero;
        int suma=0;
        int exponente=digitos;

        while(digitos>0){

            resto=calculoDigitos%10;
            calculoDigitos/=10;

            digitos--;


        }


        return resultado;
    }


}