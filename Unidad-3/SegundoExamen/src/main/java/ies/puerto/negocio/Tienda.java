package ies.puerto.negocio;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.Aparato;
import ies.puerto.modelo.entity.CuidadoPersonal;
import ies.puerto.modelo.entity.Souvenir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Tienda {

    private HashSet<Alimento> alimentos;
    private ArrayList<Aparato> aparatos;
    private ArrayList<CuidadoPersonal> cuidadoPersonals;
    private HashMap<String, Souvenir> souvenirs;


    public Tienda(){

        alimentos=new HashSet<>();
        aparatos=new ArrayList<>();
        cuidadoPersonals=new ArrayList<>();
        souvenirs=new HashMap<>();

    }

    public Tienda(HashSet<Alimento> alimentos, ArrayList<Aparato> aparatos, ArrayList<CuidadoPersonal> cuidadoPersonals, HashMap<String, Souvenir> souvenirs) {
        this.alimentos = alimentos;
        this.aparatos = aparatos;
        this.cuidadoPersonals = cuidadoPersonals;
        this.souvenirs = souvenirs;
    }


    /**
     * Funcion que agrega alimentos a la lista
     * @param alimento
     * @return true si fue insertado
     */
    public boolean addAlimentos(Alimento alimento){

        if(!alimentos.contains(alimento)){
            alimentos.add(alimento);
        }
        return true;
    }

    /**
     * Funcion que agrega productos a la lista
     * @param aparato
     * @return true si fue insertado
     */
     public boolean addAparatos(Aparato aparato){

        if(!aparatos.contains(aparato)){
            aparatos.add(aparato);
        }
      return true;
    }

    /**
     * Funcion que agrega productos a la lista
     * @param cuidadoPersonal
     * @return true si fue insertado
     */
    public boolean addCuidadoPersonal(CuidadoPersonal cuidadoPersonal){

        if(!cuidadoPersonals.contains(cuidadoPersonal)){
            cuidadoPersonals.add(cuidadoPersonal);
        }
        return true;
    }

    /**
     * Funcion que agrega productos a la lista
     * @param souvenir
     * @return true si fue insertado
     */
    public boolean addSouvenirs(Souvenir souvenir){

        if(!souvenirs.containsKey(souvenir.getId())){
            souvenirs.put(souvenir.getId(),souvenir);
        }
        return true;
    }

    /**
     * Funcion que elimina alimentos de la lista
     * @param alimento
     * @return true si fue eliminado
     *
     */
    public boolean removeAlimentos(Alimento alimento){
        if(alimentos.contains(alimento)){
            alimentos.remove(alimento);
        }
        return true;
    }
    /**
     * Funcion que elimina aparatos de la lista
     * @param aparato
     * @return true si fue eliminado
     *
     */
    public boolean removeAparatos(Aparato aparato){
        if(aparatos.contains(aparato)){
            aparatos.remove(aparato);
        }
        return true;
    }
    /**
     * Funcion que elimina productos de la lista
     * @param cuidadoPersonal
     * @return true si fue eliminado
     *
     */
    public boolean removeCuidadoPersonal(CuidadoPersonal cuidadoPersonal){
        if(cuidadoPersonals.contains(cuidadoPersonal)){
            cuidadoPersonals.remove(cuidadoPersonal);
        }
        return true;
    }

    /**
     * Funcion que elimina souvenirs de la lista
     * @param souvenir
     * @return true si fue eliminado
     *
     */
    public boolean removeSouvenirs(Souvenir souvenir){
        if(souvenirs.containsKey(souvenir.getId())){
            souvenirs.remove(souvenir.getId());
        }
        return true;
    }


    /**
     * Funcion que obtiene alimentos de la lista
     * @param id
     * @return el alimento de la lista
     *
     */
    public Alimento obtenerAlimento(String id){
        for (Alimento alimento:alimentos) {
            if(alimento.getId().equals(id)){
                return alimento;
            }
        }
      return null;
    }
    /**
     * Funcion que obtiene aparatos de la lista
     * @param id
     * @return el aparato de la lista
     *
     */
    public Aparato obtenerAparato(String id){
        for (Aparato aparato:aparatos) {
            if(aparato.getId().equals(id)){
                return aparato;
            }
        }
        return null;
    }
    /**
     * Funcion que obtiene Productos Cuidado Personal de la lista
     * @param id
     * @return el Producto de la lista
     *
     */
    public CuidadoPersonal obtenerCuidadoPersonal(String id){
        for (CuidadoPersonal cuidadoPersonal:cuidadoPersonals) {
            if(cuidadoPersonal.getId().equals(id)){
                return cuidadoPersonal;
            }
        }
        return null;
    }
    /**
     * Funcion que obtiene souvenirs de la lista
     * @param id
     * @return el souvenirs de la lista
     *
     */
    public Souvenir obtenerSouvenir(String id){
        for (Souvenir souvenir:souvenirs.values()) {
            if(souvenir.getId().equals(id)){
                return souvenir;
            }
        }
        return null;
    }

    public float precioAlimentos(){
        float total=0;

        for (Alimento alimento: alimentos) {
            total+=alimento.getPrecio();
        }
        return total;
    }

    public float precioAparatos(){
        float total=0;
        for (Aparato aparato:aparatos) {

            total+=aparato.getPrecio();

        }
        return total;
    }

    public float precioCuidadoPersonal(){
        float total=0;
        for (CuidadoPersonal cuidadoPersonal:cuidadoPersonals) {

            total+=cuidadoPersonal.getPrecio();

        }
        return total;
    }

    public float precioSouvenirs(){
        float total=0;
        for (Souvenir souvenir:souvenirs.values()) {

            total+=souvenir.getPrecio();

        }
        return total;
    }

    public float precioTotalProductos(){
        return precioAlimentos()+precioAparatos()+precioCuidadoPersonal()+precioSouvenirs();
    }

   public int cantidadDeAlimentos(){

        int cantidad=0;
        if(alimentos.isEmpty()){
            return cantidad;
        }

       for (Alimento alimento:alimentos) {
           cantidad+=alimento.cantidadDisponible();
       }
       return cantidad;
   }

    public int cantidadDeAparatos(){

        int cantidad=0;
        if(aparatos.isEmpty()){
            return cantidad;
        }

        for (Aparato aparato:aparatos) {
            cantidad+=aparato.cantidadDisponible();
        }
        return cantidad;
    }

    public int cantidadDeCuidadoPersonal(){

        int cantidad=0;
        if(cuidadoPersonals.isEmpty()){
            return cantidad;
        }

        for (CuidadoPersonal cuidadoPersonal:cuidadoPersonals) {
            cantidad+=cuidadoPersonal.cantidadDisponible();
        }
        return cantidad;
    }

    public int cantidadDeSouvenirs(){

        int cantidad=0;
        if(souvenirs.isEmpty()){
            return cantidad;
        }

        for (Souvenir souvenir:souvenirs.values()) {
            cantidad+=souvenir.cantidadDisponible();
        }
        return cantidad;
    }

    public float gananciasAlimentos(){

        float ganacia=0;
        for (Alimento alimento:alimentos){

            ganacia+=alimento.getPrecio()-(alimento.getPrecio()/1.35f);
        }
        return ganacia;
    }

    public float gananciasAparatos(){

        float ganacia=0;
        for (Aparato aparato: aparatos){

            ganacia+=aparato.getPrecio()-(aparato.getPrecio()/1.42f);
        }
        return ganacia;
    }

    public float gananciasCuidadoPersonal(){

        float ganacia=0;
        for (CuidadoPersonal cuidadoPersonal: cuidadoPersonals){

            ganacia+=cuidadoPersonal.getPrecio()-(cuidadoPersonal.getPrecio()/1.8f);
        }
        return ganacia;
    }
    public float gananciasSouvenirs(){

        float ganacia=0;
        for (Souvenir souvenir: souvenirs.values()){

            ganacia+=souvenir.getPrecio()-(souvenir.getPrecio()/1.3f);
        }
        return ganacia;
    }

    public float ganaciaTotalTienda(){
        return gananciasAlimentos()+gananciasAparatos()+gananciasCuidadoPersonal()+gananciasSouvenirs();
    }



}
