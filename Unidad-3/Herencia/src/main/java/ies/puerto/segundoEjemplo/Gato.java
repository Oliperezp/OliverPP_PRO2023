package ies.puerto.segundoEjemplo;

public class Gato extends Especie {

    public Gato(String nombre,int chip){
        super(nombre,chip);
    }


    @Override
    public String suSonido(){
        return "Miauuu!";
    }



}
