package ies.puerto.modelo.impl.fichero.interfaces;

import ies.puerto.modelo.impl.abstractas.Producto;


import java.util.List;

public interface IFileInterface {
    public List<Producto> lectura(String path, String articulo);
    public boolean escritura(String path, String contenido);
    public boolean actualizar(Producto producto);
    public boolean borrar(Producto producto);
}
