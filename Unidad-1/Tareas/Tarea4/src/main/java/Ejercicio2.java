import java.util.Scanner;

public class Ejercicio2 {


    /**
     * Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números.
     * Se debe solicitar los números por teclado.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int aux;

        System.out.println("Dame el primero numero para el MCD:");
        int numero1=sc.nextInt();
        System.out.println("Dame el segundo numero para el MCD:");
        int numero2=sc.nextInt();


        while(numero2!=0){

            aux=numero2;
            numero2=numero1%numero2;
            numero1=aux;


        }


        System.out.println("El MCD de estos dos numero es:" +numero1);


    }
}
