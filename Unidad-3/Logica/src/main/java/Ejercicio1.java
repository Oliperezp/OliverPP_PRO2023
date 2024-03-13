//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {

        //Escribe un programa que se encargue de comprobar si un número es o no primo. Hecho esto, imprime los números primos entre 1 y 100.


        for (int x = 1; x <= 100 ; x++) {
           for(int i = 2; i < x; i++){
                    if(x % i == 0) {
                        System.out.println("No es primo"); ;

                    }else{
                        System.out.println(x + " es un número primo");
                }
            }


        }


    }
}