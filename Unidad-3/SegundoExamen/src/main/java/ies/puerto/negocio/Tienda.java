package ies.puerto.negocio;

import ies.puerto.modelo.impl.abstractas.Producto;
import ies.puerto.modelo.impl.Alimento;
import ies.puerto.modelo.impl.Aparato;
import ies.puerto.modelo.impl.CuidadoPersonal;
import ies.puerto.modelo.impl.Souvenir;
import ies.puerto.modelo.impl.fichero.csv.implementacion.FileCsv;

import java.util.*;

public class Tienda {

    private Set<Alimento> alimentos;
    private List<Aparato> aparatos;
    private List<CuidadoPersonal> cuidadoPersonals;
    private Map<String, Souvenir> souvenirs;

    FileCsv fileCsv;

    public Tienda(){

        alimentos=new HashSet<>();
        aparatos=new ArrayList<>();
        cuidadoPersonals=new ArrayList<>();
        souvenirs=new HashMap<>();
        fileCsv = new FileCsv();

    }

    public Tienda(HashSet<Alimento> alimentos, ArrayList<Aparato> aparatos, ArrayList<CuidadoPersonal> cuidadoPersonals, HashMap<String, Souvenir> souvenirs) {
        this.alimentos = alimentos;
        this.aparatos = aparatos;
        this.cuidadoPersonals = cuidadoPersonals;
        this.souvenirs = souvenirs;
    }

    public boolean buscarArticulo(Producto articulo, List<Producto> articulos) {
        if (articulos.contains(articulo)) {
            return true;
        }
        return false;
    }

    List<Producto> obtenerAlimentos() {
        return fileCsv.obtenerAlimentos();
    }

    List<Producto> obtenerAparatos() {
        return fileCsv.obtenerAparatos();
    }

    List<Producto> obtenerSouvenirs() {
        return fileCsv.obtenerSouvenirs();
    }

    List<Producto> obtenerCuidados() {
        return fileCsv.obtenerCuidados();
    }

    public List<Producto> obtenerArticulos() {
        List<Producto> articulos = new ArrayList<>();
        articulos.addAll(fileCsv.obtenerAlimentos());
        articulos.addAll(fileCsv.obtenerAparatos());
        articulos.addAll(fileCsv.obtenerSouvenirs());
        articulos.addAll(fileCsv.obtenerCuidados());

        return articulos;
    }

    public boolean crearAlimento(Alimento alimento){
        if(fileCsv.obtenerAlimentos().contains(alimento)){
            return true;
        }
        return fileCsv.escritura(fileCsv.FICHERO_ALIMENTOS, "alimento");
    }

    public boolean crearAparato(Aparato aparato){
        if(fileCsv.obtenerAparatos().contains(aparato)){
            return true;
        }
        return fileCsv.escritura(fileCsv.FICHERO_APARATOS, "default");
    }

    public boolean crearCuidadoPersonal(CuidadoPersonal cuidadoPersonal){
        if(fileCsv.obtenerCuidados().contains(cuidadoPersonal)){
            return true;
        }
        return fileCsv.escritura(fileCsv.FICHERO_CUIDADO_PERSONAL, "cuidado");
    }

    public boolean crearSouvenir(Souvenir souvenir){
        if(fileCsv.obtenerSouvenirs().contains(souvenir)){
            return true;
        }
        return fileCsv.escritura(fileCsv.FICHERO_SOUVENIRS, "default");
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
     return alimentos.size();
   }

    public int cantidadDeAparatos(){

        int cantidad=0;
        if(aparatos.isEmpty()){
            return cantidad;
        }

        return aparatos.size();
    }

    public int cantidadDeCuidadoPersonal(){

        int cantidad=0;
        if(cuidadoPersonals.isEmpty()){
            return cantidad;
        }

        return cuidadoPersonals.size();
    }

    public int cantidadDeSouvenirs(){

        int cantidad=0;
        if(souvenirs.isEmpty()){
            return cantidad;
        }

        return souvenirs.size();
    }

    public float gananciasAlimentos(){

        float ganacia=0;
        for (Alimento alimento:alimentos){

            ganacia+=(alimento.precioMaximo())- (alimento.getPrecio());
        }
        return ganacia;
    }

    public float gananciasAparatos(){

        float ganacia=0;
        for (Aparato aparato: aparatos){

            ganacia+=(aparato.precioMaximo())-(aparato.getPrecio());
        }
        return ganacia;
    }

    public float gananciasCuidadoPersonal(){

        float ganacia=0;
        for (CuidadoPersonal cuidadoPersonal: cuidadoPersonals){

            ganacia+=(cuidadoPersonal.precioMaximo())-(cuidadoPersonal.getPrecio());
        }
        return ganacia;
    }
    public float gananciasSouvenirs(){

        float ganacia=0;
        for (Souvenir souvenir: souvenirs.values()){

            ganacia+=(souvenir.precioMaximo())-(souvenir.getPrecio());
        }
        return ganacia;
    }

    public float ganaciaTotalTienda(){
        return gananciasAlimentos()+gananciasAparatos()+gananciasCuidadoPersonal()+gananciasSouvenirs();
    }

    public boolean obtenerProductosPopulares(){
        for (CuidadoPersonal cuidados: cuidadoPersonals) {
            boolean recomendados =cuidados.productoRecomendado();
        }
        return false;
    }




}
