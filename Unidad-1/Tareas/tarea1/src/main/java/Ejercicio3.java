public class Ejercicio3 {

    /**
     * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
     * entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10. Utilia un buble __for__ y un bucle __while__.
     * @param args
     */
    public static void main(String[] args) {


        int contador = 0;
        int suma = 0;


      /*
        for (int i = 0; i <=10 ; i++) {

            contador=contador+1;
            suma+=N;
            System.out.println(suma);
            */

        int i=0;

        while(i<=10){

            contador=contador+1;
            suma+=contador;
            System.out.println(suma);
            i++;






        }
    }