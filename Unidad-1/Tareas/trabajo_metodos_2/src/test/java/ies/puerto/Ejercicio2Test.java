package ies.puerto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();



    public void verificarSignoOk(int numero,boolean resultadoOk){
        Assertions.assertEquals(resultadoOk,ejercicio2.esPositivoNegativo(numero),"No es el resultado esperado");


    }

    @Test
    public void verificarSigno(){
        verificarSignoOk(1,true);
        verificarSignoOk(-1,false);

    }


    public void verificarParidadOk(int numero,boolean resultadoOk){

        Assertions.assertEquals(resultadoOk,ejercicio2.esParImpar(numero),"No es el resutlado esperado");

    }

    public void verificarParidad(){

        verificarParidadOk(6,true);
        verificarParidadOk(3,false);

    }



}
