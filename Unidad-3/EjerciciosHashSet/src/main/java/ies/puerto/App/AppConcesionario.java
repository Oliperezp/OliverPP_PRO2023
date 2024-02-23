package ies.puerto.App;

import ies.puerto.Imple.*;

import java.util.HashSet;
import java.util.Scanner;

public class AppConcesionario {

    static Concesionario concesionario;



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        concesionario = new Concesionario();

        Coche coche = new Coche("Toyota", "Corolla", "ABC123", 60);
        Coche coche2 = new Coche("Honda", "Civic", "XYZ789", 75);
        Coche coche3 = new Coche("Ford", "Mustang", "DEF456", 100);
        Coche coche4 = new Coche("Chevrolet", "Impala", "GHI789", 80);
        Coche coche5 = new Coche("Volkswagen", "Golf", "JKL012", 65);

        Motocicleta moto = new Motocicleta("Harley-Davidson", "Sportster", "MNO345", 50);
        Motocicleta moto2 = new Motocicleta("Yamaha", "YZF R6", "PQR678", 90);
        Motocicleta moto3 = new Motocicleta("Ducati", "Monster", "STU901", 70);
        Motocicleta moto4 = new Motocicleta("Suzuki", "GSX-R750", "VWX234", 80);
        Motocicleta moto5 = new Motocicleta("Kawasaki", "Ninja", "ZAB56", 85);

        Camion camion1 = new Camion("Chevrolet", "Silverado", "UVW567", 150);
        Camion camion2 = new Camion("Ford", "Ranger", "LMN890", 130);
        Camion camion3 = new Camion("Toyota", "Hilux", "PQR123", 140);
        Camion camion4 = new Camion("Nissan", "Navara", "ABC456", 145);
        Camion camion5 = new Camion("Dodge", "Ram", "XYZ789", 160);

        Bicicleta bici1 = new Bicicleta("Trek", "MountainBike", "PQR456", 30);
        Bicicleta bici2 = new Bicicleta("Giant", "CityBike", "MNO789", 25);
        Bicicleta bici3 = new Bicicleta("Specialized", "RoadBike", "JKL012", 28);
        Bicicleta bici4 = new Bicicleta("Cannondale", "HybridBike", "DEF345", 26);
        Bicicleta bici5 = new Bicicleta("Schwinn", "Cruiser", "MNO678", 22);


        System.out.println("##################");
        System.out.println("MENU CONCESIONARIO");
        System.out.println("##################");


        int opcion;
        do {

            System.out.println("1. Añadir vehículo");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar Vehiculo");
            System.out.println("4. Mostrar velocidad media de vehículos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarVehiculo(concesionario);
                    break;
                case 2:
                    eliminarVehiculo();
                   break;
                case 3:
                   obtenerVehiculo(concesionario);
                   break;
                case 4:
                    mostrarVelocidadesMedias(concesionario);
                    break;

                case 5:
                    opcion=5;
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
    }

    private static void agregarVehiculo(Concesionario concesionario) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Coche");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camion");
        System.out.println("4. Bicicleta");
        int tipo = sc.nextInt();

        System.out.print("Ingrese marca: ");
        String marca = sc.nextLine();sc.nextLine();
        System.out.print("Ingrese modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ingrese matricula: ");
        String matricula = sc.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Ingrese velocidad del coche: ");
                int velocidadCoche = sc.nextInt();
                concesionario.addCoche(new Coche(marca, modelo, matricula, velocidadCoche));
                break;
            case 2:
                System.out.print("Ingrese velocidad de la motocicleta: ");
                int velocidadMoto = sc.nextInt();
                concesionario.addMotocicleta(new Motocicleta(marca, modelo, matricula, velocidadMoto));
                break;
            case 3:
                System.out.print("Ingrese velocidad del camion: ");
                int velocidadCamion = sc.nextInt();
                concesionario.addCamion(new Camion(marca, modelo, matricula, velocidadCamion));
                break;
            case 4:
                System.out.print("Ingrese velocidad de la bici: ");
                int velocidadBicicleta = sc.nextInt();
                concesionario.addBicicleta(new Bicicleta(marca, modelo, matricula,velocidadBicicleta));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void mostrarVelocidadesMedias(Concesionario concesionario) {
        System.out.println("Velocidad media de coches: " + concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media de motocicletas: " + concesionario.velocidadMediaMotos());
        System.out.println("Velocidad media de camiones: " + concesionario.velocidadMediaCamiones());
        System.out.println("Velocidad media de bicicletas: " + concesionario.velocidadMediaBicicletas());
    }


    private static void obtenerVehiculo(Concesionario concesionario) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Coche");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camion");
        System.out.println("4. Bicicleta");
        int tipo = sc.nextInt();

        System.out.print("Ingrese matricula: ");
        String matricula = sc.next();

        switch (tipo) {
            case 1:
                concesionario.obtenerCoche(matricula);

                break;
            case 2:
                concesionario.obtenerMotocicleta(matricula);
                break;
            case 3:
                concesionario.obtenerCamion(matricula);
                break;
            case 4:
                concesionario.obtenerBicicleta(matricula);
                break;
            default:
                System.out.println("Opción no válida.");
        }


    }
    public static void eliminarVehiculo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Coche");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camion");
        System.out.println("4. Bicicleta");
        int tipo = sc.nextInt();

        System.out.print("Ingrese matricula: ");
        String matricula = sc.next();

        switch (tipo) {
            case 1:
                Coche cocheAEliminar = concesionario.obtenerCoche(matricula);
                concesionario.removeCoche(cocheAEliminar);
                break;
            case 2:
                concesionario.obtenerMotocicleta(matricula);
                break;
            case 3:
                concesionario.obtenerCamion(matricula);
                break;
            case 4:
                concesionario.obtenerBicicleta(matricula);
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }

}

