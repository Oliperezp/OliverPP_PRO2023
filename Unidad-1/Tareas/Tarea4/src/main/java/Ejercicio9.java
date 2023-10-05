import java.util.Scanner;

public class Ejercicio9 {


    /**
     *  Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for.
     *  Solicita el valor de la tabla por teclado
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Tabla de multiplicar del:");
        int tabla=sc.nextInt();


        for (int i = 1; i <= 10 ; i++) {

            int multiplicacion=tabla * i;

            System.out.println(tabla + "x" + i + "=" + multiplicacion);

        }



    }
}
