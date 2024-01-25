package ies.puerto.App;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppLista {

    static List<Integer> miListaEnteros;

    public static void main(String[] args) {

        miListaEnteros=new ArrayList<>();
        addElemento(1);
        addElemento(2);

        List<Integer> subSubLista = new ArrayList<>();
        subSubLista.add(3);
        subSubLista.add(4);
        addSubLista(subSubLista);

        System.out.println(miListaEnteros);

    }

    public static boolean addElemento(Integer elemento){
            return miListaEnteros.add(elemento);
    }
    public static boolean removeElemento(Integer elemento){
        return miListaEnteros.remove(elemento);
    }

    public static boolean addSubLista(Collection subLista){

        return miListaEnteros.addAll(subLista);
    }

}
