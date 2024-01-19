package ies.puerto.abstracta;

import ies.puerto.interfaz.IConexionRed;

public abstract class ConexionRedAbstract implements IConexionRed {

    private int ip;


    public ConexionRedAbstract(){}

    public ConexionRedAbstract(int ip) {
        this.ip = ip;
    }


    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }
}
