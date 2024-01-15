public class Cuadrado extends Rectangulo{


    public Cuadrado(){}

    public Cuadrado(float base){
        super(base,base);
    }


    @Override
    public String toString(){
        return "El lado del cuadrado es:" + getBase()+" ,y la altura: " + getAltura();
    }
}
