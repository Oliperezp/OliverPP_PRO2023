package ies.puerto.Tienda;

public class Tienda {


    private Producto producto;
    private Producto producto1;
    private Producto producto2;


    /**
     * Constructor por defecto
     */
    public Tienda() {
    }

    /**
     * Contructor de la clase con los atributos nombre,precio y stock
     * @param nombre
     * @param precio
     * @param stock
     */
    public Tienda(String nombre,double precio,int stock) {
        this.producto = new Producto("Cacahuete",2.50,10);
        this.producto1 = new Producto("Almendra",3,5);
        this.producto2 = new Producto("Manzana",2.75,20);

    }

    /**
     * Funcion que agrega al stock una cantidad segun el numero del producto que sea
     * @param num_producto
     * @param cantidad
     * @return la cantidad agregada de stock
     */
    public void agregarProducto(int num_producto,int cantidad){

        switch (num_producto){

            case 1:
                producto.agregarStock(cantidad);
                break;
            case 2:
                producto1.agregarStock(cantidad);
                break;
            case 3:
                producto2.agregarStock(cantidad);
                break;
        }


    }

    /**
     * Funcion que retira del stock una cantidad segun el numero del producto que sea
     * @param num_producto
     * @param cantidad
     */
    public void retirarProducto(int num_producto,int cantidad){

        switch (num_producto){

            case 1:
                producto.retirarStock(cantidad);
                break;
            case 2:
                producto1.retirarStock(cantidad);
                break;
            case 3:
                producto2.retirarStock(cantidad);
                break;
        }

    }



    public String mostrarInventario(){

        return "Producto 1 :" + producto + "Producto 2 :" + producto1 + "Producto 3 :" + producto2;
    }


}