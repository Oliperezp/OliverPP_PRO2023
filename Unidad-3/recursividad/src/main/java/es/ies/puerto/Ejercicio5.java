package es.ies.puerto;

public class Ejercicio5 {

    public int potenciaTradicional(int base,int exponente){

        int resultado=1;
        if(exponente==0){
            return 1;
        }
        for (int i = 0; i < exponente ; i++) {
            resultado*=base;
        }
     return resultado;
    }

    public int potenciaRecursiva(int base,int exponente){

        if(exponente==0){
            return 1;
        }
        if(exponente==1){
            return base;
        }
      return base * potenciaRecursiva(base,exponente-1);
    }


}
