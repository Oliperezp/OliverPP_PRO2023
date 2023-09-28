import java.util.Scanner;

public class Ejercicio6 {


    /**
     * Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primo=1;
        int i = 1;
        int c=0;

        System.out.println("Introduzca el numero entero y te dire si es primo o no: ");
         primo=sc.nextInt();

        while(i<=primo){

            if(primo%1 ==0){

                c++;

            }

        }

        if(c==2){

            System.out.println("El numero" + primo + "es primo");
        }else{

            System.out.println("El numero" + primo + "no es primo");

        }



            }










    }



