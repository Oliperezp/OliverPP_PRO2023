package ies.puerto.Tienda;

public class Producto {

private String nombre;
private double precio;
private int stock;

    /**
     * Constructor por defecto
     */
    public Producto(){}


    /**
     * Contructor de la clase con el nombre,precio y stock del producto
     * @param nombre
     * @param precio
     * @param stock
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }


    /**
     * Funcion que suma la cantidad agregada de stock
     * @param cantidad
     */

    public int agregarStock(int cantidad){

      stock+=cantidad;

       return stock;
    }

    /**
     * Funcion que resta la cantidad de stock establecida
     * @param cantidad
     */
    public int retirarStock(int cantidad){

      stock-=cantidad;

       return stock;

}



}
