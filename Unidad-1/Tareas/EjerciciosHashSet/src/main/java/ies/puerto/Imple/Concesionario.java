package ies.puerto.Imple;

import java.util.*;

public class Concesionario {

    private HashSet<Coche> coches;
    private ArrayList<Motocicleta> motos;

    private Map<String,Camion> camionMap;
    private Map<String,Bicicleta> bicicletaMap;



    public Concesionario(){
        coches=new HashSet<>();
        motos=new ArrayList<>();
        bicicletaMap=new HashMap<>();
        camionMap=new HashMap<>();

    }

    public Concesionario(HashSet<Coche> coches, ArrayList<Motocicleta> motos) {
        this.coches = coches;
        this.motos = motos;
    }

    public HashSet<Coche> getCoches() {
        return coches;
    }

    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }

    public ArrayList<Motocicleta> getMotos() {
        return motos;
    }

    public void setMotos(ArrayList<Motocicleta> motos) {
        this.motos = motos;
    }

    public boolean addCoche(Coche coche){


            if(!coches.contains(coche)){
                return coches.add(coche);
            }

       return false;
    }

    public boolean removeCoche(Coche coche){


            if(coches.contains(coche)){
                return coches.remove(coche);
            }
        return false;
    }

    public Coche obtenerCoche(String matricula){
        for (Coche coche:coches) {

            if(coche.getMatricula().equals(matricula)){
                return coche;
            }

        }
       return null;
    }

    public float velocidadMediaCoches(){
        float suma=0;
        if(coches.isEmpty()){
            return suma;
        }

        for (Coche coche: coches) {
            suma+=coche.getVelocidad();
        }
        return suma/coches.size();
    }


    public boolean addMotocicleta(Motocicleta motocicleta){

        if (!motos.contains(motocicleta)) {
            return motos.add(motocicleta);
        }
        return false;
        }

    public boolean removeMotocicleta(Motocicleta motocicleta){



            if(motos.contains(motocicleta)){
                return motos.remove(motocicleta);
            }


        return false;
    }

    public Motocicleta obtenerMotocicleta(String matricula){
        for (Motocicleta motocicletas: motos) {

            if(motocicletas.getMatricula().equals(matricula)){
                return motocicletas;
            }

        }
        return null;
    }

    public float velocidadMediaMotos(){
        float suma=0;
        if(motos.isEmpty()){
            return suma;
        }

        for (Motocicleta motocicleta: motos) {
            suma+=motocicleta.getVelocidad();
        }
        return suma/motos.size();
    }

    public float velocidadMediaVehiculos(){
        float sumaMotos=0f;
        float sumaCoches=0f;

        int tamanio=coches.size()+motos.size();

        if(coches.isEmpty()){
            return sumaCoches;
        }
        if(motos.isEmpty()){
            return sumaMotos;
        }

        for (Coche coche: coches) {
            sumaCoches+=velocidadMediaCoches();
        }

        for (Motocicleta motocicleta:motos) {
            sumaMotos+=velocidadMediaMotos();
        }

        float sumaTotal= sumaCoches+sumaMotos;

        return sumaTotal/tamanio;
    }


    public boolean addCamion(Camion camion){
        if(!camionMap.containsKey(camion)){
             camionMap.put(camion.getMatricula(),camion);
        }
        return true;
    }
    public boolean removeCamion(Camion camion){
        if(camionMap.containsKey(camion)){
            camionMap.remove(camion.getMatricula(),camion);
        }
        return true;
    }

    public Camion obtenerCamion(Camion camion){

        return camion;
    }




}
