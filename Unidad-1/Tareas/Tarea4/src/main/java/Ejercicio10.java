import java.util.Scanner;

public class Ejercicio10 {


    /**
     * Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Dame el rango para sumar todos los numeros pares:");
        int rango=sc.nextInt();

        int numero=1;
        int sumaPares=0;

        do{

            if(numero%2==0){

                sumaPares=sumaPares+numero;


            }

            numero++;

        }while(rango!=numero);

        System.out.println("La sumas de los numeros pares hasta ese rango es:" + sumaPares);

    }
}
