import java.util.Scanner;

/**
 * @author Oliver
 */
public class Ejercicio4 {

    /**
     * Programa que permite leer un valor cualquiera N y escribe si dicho número es par o impar.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Dame un numero entero y te dire si es par o impar: ");
        num=sc.nextInt();



        if(num%2 == 0){
            System.out.println("El numero es par");

        }else{

            System.out.println("El numero es impar");
        }






    }
}