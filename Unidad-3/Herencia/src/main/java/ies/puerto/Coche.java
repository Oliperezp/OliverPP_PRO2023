package ies.puerto;

public class Coche extends Motor{

public Coche(String color){
    super(color);
}

    public Coche() {
        super();
    }

    public Coche(String color,String matricula){
    super(color,matricula);

    }

    @Override
    public String toString() {
        String mensaje="Y soy un coche,";
        //return "Yo soy un coche y mi color es: " +getColor();

        if(getColor()!=null){
            mensaje +=" y mi color es: " +getColor();
        }

        if(getMatricula()!=null){

            mensaje+=", y mi matricula es:" + getMatricula();
        }
        return mensaje;
    }
}
