package ies.puerto.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosFichero implements ILecturaDatos {


    @Override
    public String lectura() {
        return "Realizadas las lecturas de datos desde ficheros";
    }

    @Override
    public String apertura() {
        return "Abriendo el sistema de Ficheros";
    }

    @Override
    public String cierre() {
        return "Cerrando el sistema de ficheros";
    }
}
