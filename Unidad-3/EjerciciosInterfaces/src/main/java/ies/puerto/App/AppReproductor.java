package ies.puerto.App;

import ies.puerto.impl.ReproductorMp3;
import ies.puerto.interfaz.IReproductor;

public class AppReproductor {

    static IReproductor reproductorMp3;

    public static void main(String[] args) {

        reproductorMp3=new ReproductorMp3();
        System.out.println(reproductorMp3.reproducir());
        System.out.println(reproductorMp3.detener());
    }

}
