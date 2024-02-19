package ies.puerto.presentacion;

public class CuidadoPersonal extends Articulo{

    private int popularidad;

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad,int popularidad) {
        super(nombre, precio, fechaEntrada, id, null);
        this.popularidad= popularidad;
    }


    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", id='" + getId() + '\'' +
                ",popularidad='" + popularidad +
                '}';
    }


}
