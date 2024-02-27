package ies.puerto.negocio;

import ies.puerto.modelo.impl.abstractas.Producto;
import ies.puerto.modelo.impl.Alimento;
import ies.puerto.modelo.impl.Aparato;
import ies.puerto.modelo.impl.CuidadoPersonal;
import ies.puerto.modelo.impl.Souvenir;
import ies.puerto.modelo.impl.fichero.csv.implementacion.FileCsv;

import java.io.FileReader;
import java.io.IOException;
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

    public List<Producto> obtenerProductos() {
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

    public boolean borrarAlimento(Producto producto){
        if(fileCsv.obtenerAlimentos().contains(producto)){
            return true;
        }
        return fileCsv.borrarProducto(fileCsv.FICHERO_ALIMENTOS,producto);
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

   public void cantidadDeAlimentos(){
       int count = 0;
       try {
           FileReader reader = new FileReader("alimentos.csv");

           while (reader.readNext() != null) {
               count++;
           }
           reader.close();
           System.out.println("Número total de registros: " + count);
       } catch (IOException e) {
           System.out.println("Error al contar registros en el archivo CSV: " + e.getMessage());
       }


   }

   public void cantidadDeAparatos(){


           int count = 0;
           try {
               FileReader reader = new FileReader("aparatos.csv");

               while (reader.readNext() != null) {
                   count++;
               }
               reader.close();
               System.out.println("Número total de registros: " + count);
           } catch (IOException e) {
               System.out.println("Error al contar registros en el archivo CSV: " + e.getMessage());
           }


       }


    public void cantidadDeCuidadoPersonal(){


            int count = 0;
            try {
                FileReader reader = new FileReader("cuidado-personal.csv");

                while (reader.readNext() != null) {
                    count++;
                }
                reader.close();
                System.out.println("Número total de registros: " + count);
            } catch (IOException e) {
                System.out.println("Error al contar registros en el archivo CSV: " + e.getMessage());
            }
        }


    public void cantidadDeSouvenirs(){


            int count = 0;
            try {
                FileReader reader = new FileReader("souvernirs.csv");

                while (reader.readNext() != null) {
                    count++;
                }
                reader.close();
                System.out.println("Número total de registros: " + count);
            } catch (IOException e) {
                System.out.println("Error al contar registros en el archivo CSV: " + e.getMessage());
            }

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
