package ies.puerto;

public class Ejercicio6 {


    /**
     * Funcion que realizar la conversion entre grados Fahrenheit en grados centigrados
     * @param gradosFahrenheit para hacer una conversion a grados centigrados
     * @return los grados centigrados
     */
    public int conversorCentigrados(int gradosFahrenheit){

        int centigrados=0;


        centigrados=((gradosFahrenheit-32)*5)/9;


        return centigrados;
    }


}