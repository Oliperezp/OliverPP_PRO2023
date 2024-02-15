package ies.puerto.App;

import ies.puerto.implementacion.Alimento;
import ies.puerto.implementacion.Electronica;
import ies.puerto.implementacion.Soubenir;
import ies.puerto.implementacion.Supermercado;

import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppTienda {

    static Supermercado supermercado;


    public static void main(String[] args) {
        supermercado = new Supermercado();
        Scanner scanner = new Scanner(System.in);

        int opcion;


        do {
            System.out.println();
            System.out.println("MENU DE LA TIENDA");
            System.out.println("1. Añadir Producto");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Modificar Producto");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    aniadirProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    modificarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 5);


    }

    public static void eliminarProducto() {

        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        String udi;

        boolean eliminado = false;

        menu();

        System.out.println("Ingrese el Udi del producto:");
        udi = scanner.nextLine();

        switch (opcion) {
            case 1:
                Alimento alimentoAEliminar = supermercado.obtenerAlimento(udi);
                if (alimentoAEliminar != null) {

                 eliminado = supermercado.removeAlimento(alimentoAEliminar);
                }
                break;
            case 2:
                Electronica electronicaAEliminar = supermercado.obtenerElectronica(udi);
                eliminado = supermercado.removeElectronica(electronicaAEliminar);
                break;
            case 3:
                Soubenir soubenirAEliminar = supermercado.obtenerSoubenir(udi);
                eliminado = supermercado.removeSoubenir(soubenirAEliminar);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static void mostrarProductos() {
        Scanner scanner = new Scanner(System.in);

        int opcion=0;
        String udi;

        menu();

        System.out.println("Ingrese el Udi del producto:");
        udi = scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println(supermercado.obtenerAlimento(udi));
                break;
            case 2:
                System.out.println(supermercado.obtenerElectronica(udi));
                break;
            case 3:
                System.out.println(supermercado.obtenerSoubenir(udi));
                break;
            default:
                System.out.println("Opción no válida");
        }

    }

    public static void aniadirProducto() {
        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        String udi;
        String nombre;
        float precio;
        String fechaEntrada;

        menu();

        System.out.println("Nombre del producto:");
        nombre = scanner.nextLine();

        System.out.println("Precio:");
        precio = scanner.nextFloat();
        System.out.println("Fecha Entrada:");
        fechaEntrada = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Udi:");
        udi = scanner.nextLine();

        switch (opcion) {
            case 1:
                Alimento alimento = new Alimento();
                supermercado.addAlimento(new Alimento(nombre, precio, fechaEntrada, udi));
                break;
            case 2:
                supermercado.addElectronica(new Electronica(nombre, precio, fechaEntrada, udi));
                break;
            case 3:
                supermercado.addSoubenirs(new Soubenir(nombre, precio, fechaEntrada, udi));
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static void modificarProducto() {
        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        String udi;
        String nombre;
        float precio;
        String fechaEntrada;

        menu();

        System.out.println("Nombre del producto:");
        nombre = scanner.nextLine();
        System.out.println("Precio:");
        precio = scanner.nextFloat();
        System.out.println("Fecha Entrada:");
        fechaEntrada = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Udi del producto a modificar:");
        udi = scanner.nextLine();

        switch (opcion) {
            case 1:
                 modificarAlimento(nombre,precio,fechaEntrada,udi);
                break;
            case 2:
               modificarElectronica(nombre,precio,fechaEntrada,udi);
                break;
            case 3:
               modificarSoubenir(nombre,precio,fechaEntrada,udi);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static void modificarAlimento(String nombre, float precio, String fechaEntrada, String udi) {

        Alimento alimentoAModificar = supermercado.obtenerAlimento(udi);
        if (alimentoAModificar != null) {
            alimentoAModificar.setNombre(nombre);
            alimentoAModificar.setPrecio(precio);
            alimentoAModificar.setFechaEntrada(fechaEntrada);
        }

    }

    public static void modificarElectronica(String nombre, float precio, String fechaEntrada, String udi) {

        Electronica electronicaAModificar = supermercado.obtenerElectronica(udi);
        if (electronicaAModificar != null) {
            electronicaAModificar.setNombre(nombre);
            electronicaAModificar.setPrecio(precio);
            electronicaAModificar.setFechaEntrada(fechaEntrada);
        }

    }

    public static void modificarSoubenir(String nombre, float precio, String fechaEntrada, String udi) {

        Soubenir soubenirAModificar = supermercado.obtenerSoubenir(udi);
        if (soubenirAModificar != null) {
            soubenirAModificar.setNombre(nombre);
            soubenirAModificar.setPrecio(precio);
            soubenirAModificar.setFechaEntrada(fechaEntrada);
        }

    }

    public static void menu(){
        int opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Alimento");
        System.out.println("2. Electrónica");
        System.out.println("3. Soubenir");
        System.out.print("Ingrese su opción: ");
        opcion = scanner.nextInt();scanner.nextLine();
    }


}
















