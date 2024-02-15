package ies.puerto.modelo.ficheros.csv.implementacion;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;
import ies.puerto.modelo.ficheros.abstractas.BibliotecaAbstractFile;
import ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.File;
import java.util.List;

public class BibliotecaCsv extends BibliotecaAbstractFile implements IBiblioteca {


    @Override
    public BibliotecaEntity buscarBiblioteca(int id) {

        return null;
    }

    @Override
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity actualizarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity eliminarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }


}
