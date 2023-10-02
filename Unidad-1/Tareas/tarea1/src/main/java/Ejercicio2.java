public class Ejercicio2 {
    /**
     * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
     * El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
     * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
     * @param args
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int valorA;
        int valorB;
        int valorC;

        do{
            System.out.println("Dame el valor de A:");
            valorA=sc.nextInt();
            System.out.println("Dame el valor de B:");
            valorB=sc.nextInt();
            System.out.println("Dame el valor de C:");
            valorC=sc.nextInt();

            if((valorA==valorB) || (valorB == valorC) || (valorA==valorC)){

                System.out.println("Dos o mas valores son iguales");
            }

        }while((valorA==valorB) || (valorB == valorC) || (valorA==valorC));



        if((valorA > valorB) && (valorA>valorC)){

            System.out.println("El :" + valorA + " es el mayor");


        }else if((valorB>valorA) && (valorB>valorC)){

            System.out.println("El :" + valorB + "es el mayor");

        }else{

            System.out.println("El :" + valorC + "es el mayor");


        }



    }





}
}