package ies.puerto.App;

import ies.puerto.abstracta.InstrumentoAbstract;
import ies.puerto.impl.Guitarra;

public class AppInstrumento {

    static Guitarra guitarra;

    public static void main(String[] args) {

        guitarra=new Guitarra("Guitarra","Cuerdas");

        System.out.println(guitarra.cambiarCuerdas());
        System.out.println(guitarra.afinar()+ " la " + guitarra.getNombreInstrumento());
        System.out.println(guitarra.tocarNota()+ " en la " + guitarra.getNombreInstrumento());

    }


}
