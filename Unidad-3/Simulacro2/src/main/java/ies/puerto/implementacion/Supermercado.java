package ies.puerto.implementacion;

import java.text.ParseException;
import java.util.*;

public class Supermercado {

    private HashSet<Alimento> alimentos;
    private ArrayList<Electronica> electronica;
    private Map<String, Soubenir> soubenirs;

    public Supermercado() {
        alimentos = new HashSet<>();
        electronica = new ArrayList<>();
        soubenirs = new HashMap<>();
    }

    public Supermercado(HashSet<Alimento> alimentos, ArrayList<Electronica> electronica, Map<String, Soubenir> soubenirs) {
        this.alimentos = alimentos;
        this.electronica = electronica;
        this.soubenirs = soubenirs;
    }

    public boolean addAlimento(Alimento alimento) {
        if (!alimentos.contains(alimento)) {
            return alimentos.add(alimento);
        }
        return true;
    }

    public boolean addElectronica(Electronica electronicas) {
        if (!electronica.contains(electronicas)) {
            return electronica.add(electronicas);
        }
        return true;
    }


    public boolean addSoubenirs(Soubenir soubenir) {
        if (!soubenirs.containsKey(soubenir.getUdi())) {
            soubenirs.put(soubenir.getUdi(), soubenir);
        }

        return true;
    }


    public boolean removeAlimento(Alimento alimento) {
        if (alimentos.contains(alimento)) {
             alimentos.remove(alimento);
        }
        return true;
    }

    public boolean removeElectronica(Electronica electronicas) {
        if (electronica.contains(electronicas)) {
             electronica.remove(electronicas);
        }
        return true;
    }

    public boolean removeSoubenir(Soubenir soubenir) {
        if (soubenirs.containsKey(soubenir.getUdi())) {
            soubenirs.remove(soubenir.getUdi(), soubenir);
        }
        return true;
    }


    public Alimento obtenerAlimento(String udi) {

        for (Alimento alimento : alimentos) {
            if (alimento.getUdi().equals(udi)) {
                return alimento;
            }
        }

        return null;
    }


    public Electronica obtenerElectronica(String udi) {

        for (Electronica electronicas : electronica) {
            if (electronicas.getUdi().equals(udi)){
                return electronicas;
            }
        }

        return null;
    }


    public Soubenir obtenerSoubenir(String udi) {

        for (Soubenir soubenir : soubenirs.values()) {
            if (soubenir.getUdi().equals(udi)) {
                return soubenir;
            }
        }

        return null;
    }

    public double precioAlimentos() {

        double suma = 0;
        for (Alimento alimentos : alimentos) {
            suma += alimentos.precioMaximo();
        }
        return suma;
    }

    public double precioElectronica() {

        double suma = 0;
        for (Electronica electronica1 : electronica) {
            suma += electronica1.precioMaximo();
        }
        return suma;
    }

    public double precioSoubenirs() {

        double suma = 0;
        for (Soubenir soubenir : soubenirs.values()) {
            suma += soubenir.precioMaximo();
        }
        return suma;
    }

    public double precioProductos() {

        double suma = 0;

        suma = precioAlimentos() + precioElectronica() + precioSoubenirs();

        return suma;
    }

    public Alimento obtenerAlimentosCaducados(String fechaEntrada) throws ParseException {

        for (Alimento alimento : alimentos) {
            if (alimento.caducado(fechaEntrada)) {
                return alimento;
            }
        }

        return null;
    }

}

