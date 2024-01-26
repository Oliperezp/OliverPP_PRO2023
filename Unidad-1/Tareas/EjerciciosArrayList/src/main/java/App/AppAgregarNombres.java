package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppAgregarNombres {

//Crea un programa que lea una lista de nombres desde el teclado y
// los almacene en un ArrayList. Luego, ordena la lista alfabéticamente e imprímela. a la lista.

    static List<String> nombres;


    public static void main(String[] args) {

        nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String opcion = "";

        do {
            String nombre = "";

            System.out.println("Dame un nombre para agregarlo al arrayList (escribe 'salir' para finalizar): ");
            nombre = sc.nextLine();

            if (!nombre.equals("salir")) {
                nombres.add(nombre);
            } else {
                opcion = "salir";
            }

        } while (!opcion.equals("salir"));


        System.out.println("Nombres :" + nombres);





    }




}





