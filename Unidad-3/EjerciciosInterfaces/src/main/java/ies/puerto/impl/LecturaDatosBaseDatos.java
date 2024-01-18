package ies.puerto.impl;

import ies.puerto.abstracta.LecturaDatosAbstract;
import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract implements ILecturaDatos {


    @Override
    public String lectura() {
        return "Leyendo los datos desde BBDD";
    }

    @Override
    public String apertura() {
        return "Apertura de la base de BBDD";
    }

    @Override
    public String cierre() {
        return "Cierre de la base de BBDD";
    }
}
