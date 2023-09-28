import java.util.Scanner;

public class Ejercicio7 {


    /**
     * Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil,
     * expresada en kilómetros por hora, proporcione la velocidad en metros por segundo.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la velocidad del automovil en Km/h:");
        double velocidad=sc.nextInt();

        double metrosSegundo = (velocidad*1000)/3600;

        System.out.println(velocidad + "Km/h son :" + metrosSegundo+  "m/s" );


    }
}
