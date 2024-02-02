package ies.puerto2.parte2.imple;

import java.util.Objects;

public class Nota {

    private String nombreAsignatura;
    private float valor;


    public Nota(){}

    public Nota(String nombre, float valor) {
        this.nombreAsignatura = nombre;
        this.valor = valor;
    }


    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return Float.compare(valor, nota.valor) == 0 && Objects.equals(nombreAsignatura, nota.nombreAsignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreAsignatura, valor);
    }

    @Override
    public String toString() {
        return "Notas: " +
                "Nombre: " + nombreAsignatura + '\'' +
                ", valor: " + valor;
    }
}
