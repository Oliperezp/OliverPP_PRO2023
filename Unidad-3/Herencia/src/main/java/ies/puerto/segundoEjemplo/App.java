package ies.puerto.segundoEjemplo;

public class App {


   //static Animal animal;
    static Gato gato;
    static Perro perro;
    static Loro loro;

    static Serpiente serpiente;


    public static void main(String[] args) {

        //animal=new Animal();
        //System.out.println(animal.suSonido());

        gato=new Gato("Paco",4534);
        System.out.println(gato.suSonido());
        System.out.println(gato.toString());

        System.out.println();

        perro=new Perro("Manubren",5666);
        System.out.println(perro.suSonido());
        System.out.println(perro.toString());

        System.out.println();

        loro=new Loro("Juanito",3454);
        System.out.println(loro.suSonido());
        System.out.println(loro.toString());

        System.out.println();

        serpiente=new Serpiente();
        System.out.println(serpiente.suSonido());




    }

}
