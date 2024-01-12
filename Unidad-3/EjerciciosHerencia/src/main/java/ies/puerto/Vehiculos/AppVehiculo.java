package ies.puerto.Vehiculos;

public class AppVehiculo {

static Vehiculo vehiculo;
static Coche coche;
static Motocicleta moto;


    public static void main(String[] args) {

        vehiculo=new Vehiculo("Subaru","Impreza",30200);
        System.out.println(vehiculo.toString());
        System.out.println();
        coche=new Coche("Ford","Focus",20400,5);
        System.out.println(coche.toString());
        System.out.println();
        moto=new Motocicleta("Kawasaki","Ninja",30000,"XL");
        System.out.println(moto.toString());



    }


}
