package ies.puerto.App;

import ies.puerto.abstracta.LecturaDatosAbstract;
import ies.puerto.impl.LecturaDatosBaseDatos;
import ies.puerto.impl.LecturaDatosFichero;
import ies.puerto.interfaz.ILecturaDatos;

public class AppLecturaDatos {

    static LecturaDatosAbstract lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos=new LecturaDatosBaseDatos();

        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierre());
        tipo(lecturaDatos);
    }

    public static void tipo(LecturaDatosAbstract lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }


}
