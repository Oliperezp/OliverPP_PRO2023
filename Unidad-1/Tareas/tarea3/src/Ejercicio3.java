/**
 * @author Oliver
 */
public class Ejercicio3 {

    /**
     * Programa que realiza la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10.
     * Utiliza un buble __for__ y un bucle __while__.
     *
     * @param args
     */
    public static void main(String[] args) {

      int N = 0;
      int suma = 0;


      /*
        for (int i = 0; i <=10 ; i++) {

            N=N+1;
            suma+=N;
            System.out.println(suma);
            */

        int i=0;

        while(i<=10){

            N=N+1;
            suma+=N;
            System.out.println(suma);
            i++;



        }

    }
}