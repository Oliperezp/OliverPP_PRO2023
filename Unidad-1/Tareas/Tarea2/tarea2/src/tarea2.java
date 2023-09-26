import java.util.Scanner;


/**
 * @author Oliver
 * Ejercicio 2: Cual de tres numeros es el mayor
 */
public class tarea2 {

    /**
     * Programa que permite leer tres valores y almacenarlos en las variables A, B y C respectivamente.
     * El algoritmo debe imprimir cual es el mayor y cual es el menor
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        
        System.out.println("------------------------");
        System.out.println("¿QUE NUMERO ES EL MAYOR?");
        System.out.println("------------------------");

        System.out.println("Dame los tres numeros enteros para compararlos");
        System.out.println("¿Numero 1? : ");
        num1=sc.nextInt();
        System.out.println("¿Numero 2? : ");
        num2=sc.nextInt();
        System.out.println("¿Numero 3? : ");
        num3=sc.nextInt();

        if(num1 > num2 && num1>num3){

         System.out.println("El numero 1, que es :" + num1 + " es el mayor");


        }else{

            if(num2>num1 && num2>num3){

                System.out.println("El numero 2, que es :" + num2 + "es el mayor");

            }else{

                System.out.println("El numero 3, que es :" + num3 + "es el mayor");   
                

            }



        }





    }
}