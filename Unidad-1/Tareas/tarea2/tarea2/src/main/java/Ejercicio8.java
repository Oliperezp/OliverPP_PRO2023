import java.util.Scanner;

public class Ejercicio8 {

    /**
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        double promedio=0;
        double acumulador=0;
        int cuenta=-1;


        do{
            System.out.println("Dame la nota:");
            nota=sc.nextInt();

            cuenta=cuenta+1;
            acumulador=acumulador+nota;



        }while(nota!=0);

        promedio=acumulador/cuenta;





        System.out.println("Tu nota final es:" + promedio);



    }
}