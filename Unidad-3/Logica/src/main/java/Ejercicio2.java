package main.java;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(multiplos()+"\n");
    }


    public  static String multiplos(){
        for (int i = 1; i <= 100 ; i++) {

            if(i%3==0 && i%5==0){
                System.out.println("fizbuzz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }
        }
        return "";

    }
}
