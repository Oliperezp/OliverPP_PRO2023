package ies.puerto.App;

import java.util.ArrayList;
import java.util.List;

public class AppListString {

    static List<String>miListaString;

    public static void main(String[] args) {

        String dni="00000000H";
        String dni2="11111111H";

        miListaString=new ArrayList<>();

        miListaString.add(dni);
        miListaString.add(dni2);


        System.out.println(miListaString);
        boolean existe=existe(dni);
        if(existe){
            System.out.println("Existe el elemento"+dni+",en la lista:" + miListaString);
        }

        existe=existe("1234");
        if(!existe){
            System.out.println("No existe el elemento en la lista:" + miListaString);
        }



    }


    public static boolean existe(String elemento){
        return miListaString.contains(elemento);
    }

}
