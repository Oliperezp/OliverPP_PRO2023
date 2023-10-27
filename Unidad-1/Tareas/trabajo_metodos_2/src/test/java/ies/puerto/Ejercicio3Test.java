package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

  @Test
  public int verificarSuma(int valor1,int valor2){

      int resultado= ejercicio3.suma(valor1,valor2);

      Assertions.assertEquals(8,resultado,"No es el resultado esperado");

      return resultado;
  }


public void verificarSumaOk(){

      verificarSuma(3,5);
  }






}
