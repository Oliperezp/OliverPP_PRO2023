public class AppFigura {

    static Cuadrado cuadrado;
    static Triangulo triangulo;

    static Rectangulo rectangulo;


    public static void main(String[] args) {

        cuadrado=new Cuadrado(5.0f);
        System.out.println(cuadrado.toString());
        mostrarArea(cuadrado);

        System.out.println();

        triangulo=new Triangulo(10f,4f);
        System.out.println(triangulo.toString());
        mostrarArea(triangulo);

        System.out.println();

        rectangulo=new Rectangulo(4f,3f);
        System.out.println(rectangulo.toString());
        mostrarArea(rectangulo);
        System.out.println("Valor de mi area rectangulo:" + rectangulo.calcularArea());

    }

    public static void mostrarArea(Figura figura){
        System.out.println("Valor del area: " + figura.calcularArea());
    }

}
