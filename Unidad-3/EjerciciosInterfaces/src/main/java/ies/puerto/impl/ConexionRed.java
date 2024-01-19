package ies.puerto.impl;

import ies.puerto.abstracta.ConexionRedAbstract;
import ies.puerto.interfaz.IConexionRed;

public class ConexionRed extends ConexionRedAbstract  {


    public ConexionRed(){}


    public ConexionRed(int ip){
        super(ip);
    }



    @Override
    public String conectar() {
        return "Conectado via Ethernet";
    }
}
