package ies.puerto;

public class Ejercicio4 {

    //Crea un programa que intente acceder a un método de un objeto que es null. Por ejemplo un String.
    // Maneja la excepción NullPointerException.

    public static void main(String[] args) {

        String vacio = null;

        try {

            int tamanioTexto = vacio.length();

            System.out.println("La longitud del String es: " + tamanioTexto);

        } catch (NullPointerException exception) {

            System.out.println("Se ha producido un error NullPointerException, el texto es null");
        }
    }
}



