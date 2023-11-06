package ies.puerto.Tienda;

public class Tienda {


    private Producto producto;
    private Producto producto1;
    private Producto producto2;



    public Tienda() {
    }

    public Tienda(Producto producto, Producto producto1, Producto producto2, Producto producto3) {
        this.producto = new Producto("Cacahuete",2.50,10);
        this.producto1 = new Producto("Almendra",3,5);
        this.producto2 = new Producto("Manzana",2.75,20);

    }

    public void agregarProducto(int cantidad){

        double agregar=producto.getStock() + cantidad;

    }

    public void venderProducto(int cantidad) {

        double venta=producto.getStock() - cantidad;

    }

    public String mostrarInventario(){

        return "Producto 1 :" + producto + "Producto 2 :" + producto1 + "Producto 3 :" + producto2;
    }


}