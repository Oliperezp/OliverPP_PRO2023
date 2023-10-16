import java.util.Scanner;

public class Ejercicio5 {




    public static int calcularFibo(int posicion) {

        int numero1 = 1;
        int numero2 = 1;

        System.out.print(numero1 + ", " + numero2);
        for (int i = 2; i < posicion; i++) {
            int sumaFibonacci = numero1 + numero2;
            System.out.print(", " + sumaFibonacci);
            numero1 = numero2;
            numero2 = sumaFibonacci;


        }
        return numero2;
    }
        /**
         * Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci.
         * Se debe solicitar el número n por teclado.
         *
         * @param args
         */

        public static void main (String[]args){


            Scanner sc = new Scanner(System.in);

            System.out.println("Hasta que posicion quieres  llegar en fibonacci: ");
            int posicion = sc.nextInt();

            calcularFibo(posicion);

        }




}