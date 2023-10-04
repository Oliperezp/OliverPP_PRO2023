import java.util.Scanner;

/**
 * @author Nombre del autor
 */
public class Ejercicio1 {

    /**
     * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
     * El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
     * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorA;
        int valorB;

        System.out.println("Introduzca dos valores distintos");

        do{

            System.out.println("Introduce numero 1:");
            //Se asigna el valor del primero numero
            valorA = sc.nextInt();
            System.out.println("Introduce numero 2:");
            valorB = sc.nextInt();


            if(valorA == valorB){
                System.out.println("Los valores son iguales");
            }

        }while(valorA == valorB);

        if(valorA>valorB){
            System.out.println("El valor"+ valorA + "" + "es el mayor");
        }else{

            System.out.println("El valor"+ valorB + "" + "es el mayor");




        }
    }