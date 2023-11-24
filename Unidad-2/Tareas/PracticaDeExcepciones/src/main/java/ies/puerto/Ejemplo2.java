package ies.puerto;

public class Ejemplo2 {
    public static void main(String[] args) {

        int numero = 10;
        int divisor = 0;

        try {

            int division = numero / divisor;
            System.out.println(division);

        } catch (ArithmeticException exception) {

            System.out.println("Se ha producido una ArithmeticException, mensaje: " + exception.getMessage());

        }


    }
}
