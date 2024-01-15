public class Triangulo extends Figura{

    public Triangulo(){}
    public Triangulo(float base, float altura) {
        super(base, altura);
    }


    @Override
    public String toString(){
         return "Base del triangulo: " + getBase() + ",altura del triangulo: " + getAltura();
    }

    @Override
    public float calcularArea(){
        return (getBase()*getAltura())/2;
    }

}
