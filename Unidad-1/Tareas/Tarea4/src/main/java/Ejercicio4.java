import java.util.Scanner;

public class Ejercicio4 {




    /**
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
     * @param args
     */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero palindromo: ");
        int numeroPalindromo = sc.nextInt();

        int falta=0;
        int numeroInvertido=0;
        int resto=0;



        while(numeroPalindromo<=0){

            resto=falta%10;
            numeroInvertido=numeroInvertido*10+resto;
            falta=falta/10;

        }

        if(numeroInvertido==numeroPalindromo){

            System.out.println("El numero es palindromo");
        }else{

            System.out.println("El numero no es palindromo");
        }


    }
}
