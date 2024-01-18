package ies.puerto.impl;

import ies.puerto.abstracta.RegularesAbstract;
import ies.puerto.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstract implements IFormaGeometrica {

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        super(lado, lado);
    }

    public Cuadrado(float base, float altura) {
        super(base, altura);
    }


}
