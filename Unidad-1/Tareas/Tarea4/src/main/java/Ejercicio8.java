import java.util.Scanner;

public class Ejercicio8 {


    /**
     * Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.
     * @author Oliver
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int suma;
        int rango;

        System.out.println("Dame el rango para mostrarte los numeros perfectos en el:");
        rango = sc.nextInt();

        for (int i = 1; i < rango; i++) {

            suma = 0;

            for (int j = 1; j < i; j++) {

                if (i % j == 0) {

                    suma += j;

                }


            }

            if (suma == i) {

                System.out.println("El numero" + i + "es perfecto");


            }


        }
    }
}

