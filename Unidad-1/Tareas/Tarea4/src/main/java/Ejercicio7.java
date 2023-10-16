import java.util.Scanner;

public class Ejercicio7 {
    /**
     *  Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero del dia de la semana que quieres: ");
        int opcion=sc.nextInt();

        switch (opcion){

            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("El dia es Domingo");
                break;
            default:
                System.out.println("Lo siento, ese numero es erroneo");
                break;
        }





    }
}
