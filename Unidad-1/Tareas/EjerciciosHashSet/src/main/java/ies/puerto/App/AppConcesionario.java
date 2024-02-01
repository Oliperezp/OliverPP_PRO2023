package ies.puerto.App;

import ies.puerto.Imple.Coche;
import ies.puerto.Imple.Concesionario;
import ies.puerto.Imple.Motocicleta;

import java.util.HashSet;

public class AppConcesionario {

    static Concesionario concesionario;
    static Coche coche;
    static Motocicleta moto;



    public static void main(String[] args) {

         concesionario = new Concesionario();

        Coche coche  = new Coche("Toyota","Corolla","ABC123",60);
        Coche coche2 = new Coche("Honda","Civic","XYZ789",75);
        Coche coche3 = new Coche("Ford","Mustang","DEF456",100);
        Coche coche4 = new Coche("Chevrolet","Impala","GHI789",80);
        Coche coche5 = new Coche("Volkswagen","Golf","JKL012",65);

        Motocicleta moto  = new Motocicleta("Harley-Davidson","Sportster","MNO345",50);
        Motocicleta moto2 = new Motocicleta("Yamaha","YZF R6","PQR678",90);
        Motocicleta moto3 = new Motocicleta("Ducati","Monster","STU901",70);
        Motocicleta moto4 = new Motocicleta("Suzuki","GSX-R750","VWX234",80);
        Motocicleta moto5 = new Motocicleta("Kawasaki","Ninja","ZAB56",85);


        System.out.println(concesionario.addCoche(coche));
        System.out.println(concesionario.addCoche(coche2));
        System.out.println(concesionario.addCoche(coche3));
        System.out.println(concesionario.addCoche(coche4));
        System.out.println(concesionario.addCoche(coche5));

        System.out.println(concesionario.addMotocicleta(moto));
        System.out.println(concesionario.addMotocicleta(moto2));
        System.out.println(concesionario.addMotocicleta(moto3));
        System.out.println(concesionario.addMotocicleta(moto4));
        System.out.println(concesionario.addMotocicleta(moto5));
        System.out.println(concesionario.addMotocicleta( new Motocicleta("Kawasaki","Ninja H2R","HTR233",120)));
        System.out.println();


        System.out.println("La velocidad media de los coches es de:" +concesionario.velocidadMediaCoches() + " Km/h");
        System.out.println("La velocidad media de las motos es de:"+ concesionario.velocidadMediaMotos() + " Km/h");
        System.out.println("La velocidad media de todos los vehiculos es de: " + concesionario.velocidadMediaVehiculos() + "km/h");
        System.out.println();

        System.out.println("EL coche es el : " + concesionario.obtenerCoche("XYZ789"));
        System.out.println("La moto es la : " + concesionario.obtenerMotocicleta("VWX234"));
        System.out.println("La moto es la : " + concesionario.obtenerMotocicleta("HTR233"));

        System.out.println(concesionario.removeCoche(coche2));
        System.out.println(concesionario.removeMotocicleta(moto4));
        System.out.println();

        System.out.println("Se ha borrado el coche : " + concesionario.obtenerCoche("XYZ789"));
        System.out.println("Se ha borrado la moto : " + concesionario.obtenerMotocicleta("VWX234"));

        System.out.println();

        System.out.println("La velocidad maxima de los coches es: " + coche.velocidadMaxima());
        System.out.println("La velocidad maxima de las motos es de : " + moto.velocidadMaxima());









    }


}
