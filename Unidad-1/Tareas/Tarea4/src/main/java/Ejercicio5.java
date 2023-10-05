import java.util.Scanner;

public class Ejercicio5 {


    /**
     * Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci.
     * Se debe solicitar el número n por teclado.
     *
     * @param args
     */
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Hasta que posicion quieres  llegar en fibonacci: "); //se pide al usuario la posición hasta que se quiere llegar en fibonacci
        int posicion = sc.nextInt(); // se pide la posicion a la que quieres llegar en fibonacci

        int numero1 = 1;
        int numero2 = 1;

        System.out.print( numero1 + ", " + numero2); //se muestran los dos primeros numeros que en fibonacci son los dos primeros 1
        for (int i = 2; i < posicion; i++) {
            int sumaFibonacci = numero1 + numero2; // se suman los dos primeros numeros
            System.out.print(", " + sumaFibonacci); // muestra el valor ahora de los dos numeros sumados
            numero1 = numero2; //se convierte el numero1 en el numero 2
            numero2 = sumaFibonacci; //el numero 2 es ahora igual a la suma de los dos numeros sumados


        }

    }



    }

