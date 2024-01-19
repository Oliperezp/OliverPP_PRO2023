package ies.puerto.App;

import ies.puerto.abstracta.ConexionRedAbstract;
import ies.puerto.abstracta.LecturaDatosAbstract;
import ies.puerto.impl.ConexionRed;
import ies.puerto.impl.ConexionWifi;
import ies.puerto.impl.LecturaDatosBaseDatos;
import ies.puerto.interfaz.IConexionRed;

public class AppConexionRed {

    static ConexionRedAbstract conexionRed;

    public static void main(String[] args) {
        conexionRed=new ConexionRed(34534523);

        System.out.println(conexionRed.conectar()+",con Ip: " + conexionRed.getIp());
        tipo(conexionRed);
    }

    public static void tipo(ConexionRedAbstract conexionRed){
        System.out.println(conexionRed.getClass().getName());
    }







}
