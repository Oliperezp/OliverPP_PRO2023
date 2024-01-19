package ies.puerto.App;

import ies.puerto.impl.Automovil;
import ies.puerto.interfaz.IConductor;

public class AppConducir {

    static Automovil ferrari;
    static Automovil ford;

    public static void main(String[] args) {

        ferrari=new Automovil("ferrari","enzo");
        System.out.println(ferrari.arrancar()+ " " +  ferrari.getMarca() + " "  + ferrari.getModelo());
        System.out.println(ferrari.conducir());
        System.out.println(ferrari.detener());

        System.out.println();

        ford=new Automovil("Ford","Focus");
        System.out.println(ford.arrancar()+ " " +  ford.getMarca() + " "  + ford.getModelo());
        System.out.println(ford.conducir());
        System.out.println(ford.detener());





    }


}
