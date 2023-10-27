package ies.puerto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {

    /**
     * Funcion que realiza el calculo del sueldo de una persona segun las horas trabajadas
     * @param numeroHoras que trabaja una persona
     * @return el sueldo que gana una persona determinada
     */
    public float calcularSueldoHoras(float numeroHoras){

        float precioHoras = 10;
         float sueldo=0;


        sueldo = numeroHoras*precioHoras;

        return sueldo;
    }

}