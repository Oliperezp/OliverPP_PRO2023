import java.util.Scanner;

public class Ejercicio3 {

    /**
     * Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.
     * Se debe solicitar el número por teclado.
     *
     * @param args
     */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la posicion que quieres: "); //se pide al usuario la posición fibonacci
        int posicion = sc.nextInt();

        int numero1 = 1;
        int numero2 = 1;

        System.out.print( numero1 + ", " + numero2);
        for (int i = 2; i < posicion; i++) {
            int sumaFibonacci = numero1 + numero2;
            System.out.print(", " + sumaFibonacci);
            numero1 = numero2;
            numero2 = sumaFibonacci;


        }

    }

}