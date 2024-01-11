package ies.puerto;

public class App {


    static Coche miCoche;
    static Coche miCocheColor;
    static Bicicleta miBicicleta;

    static Coche miCocheMatricula;

    public static void main(String[] args) {

       miCoche=new Coche();
       miCoche.mover();
       miCoche.miColor();
        System.out.println(miCoche.toString());

        System.out.println();


       miCocheColor=new Coche("Rojo");

       miCocheColor.mover();
       miCocheColor.miColor();
        System.out.println(miCocheColor.toString());

        System.out.println();

       miBicicleta=new Bicicleta("L","Negro");
       miBicicleta.mover();
       miBicicleta.miColor();
        System.out.println(miBicicleta.toString());

        System.out.println();

        miCocheMatricula=new Coche("Azul","1956TGH");
        miCocheMatricula.mover();
        System.out.println(miCocheMatricula.toString());



    }
}
