package App;

import impl.OperacionesArrayList;

import java.util.ArrayList;
import java.util.List;

public class AppArrayCadenas {

        public static void main(String[] args) {

        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("Manolo");
        listaPalabras.add("Amparo");
        listaPalabras.add("Aguacate");
        listaPalabras.add("Pantalon");
        listaPalabras.add("Antifaz");

        int cantidadPalabrasConA = OperacionesArrayList.empiezaPorA(listaPalabras);


        System.out.println("Las palabras que comienzan con A son: " + cantidadPalabrasConA);
    }

}
