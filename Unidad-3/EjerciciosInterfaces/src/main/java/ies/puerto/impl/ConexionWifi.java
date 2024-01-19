package ies.puerto.impl;

import ies.puerto.abstracta.ConexionRedAbstract;
import ies.puerto.interfaz.IConexionRed;

public class ConexionWifi extends ConexionRedAbstract  {


    public ConexionWifi(){}


    public ConexionWifi(int ip){
        super(ip);
    }


    @Override
    public String conectar() {
        return "Conectando via Wifi";
    }
}
