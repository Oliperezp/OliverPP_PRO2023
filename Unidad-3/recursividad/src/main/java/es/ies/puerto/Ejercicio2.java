package es.ies.puerto;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

  public List<Integer> cuentaDescendenteTradicional(int numero){
      List<Integer> numeros=new ArrayList<>();
      for (int i = numero; i >=0 ; i--) {
          numeros.add(i);
      }
      return numeros;
  }

  public List<Integer>cuentaDescendenteRecursiva(int numero){
      List<Integer>numeros=new ArrayList<>();

      numeros.add(numero);

      if(numero==0){
          return numeros;
      }
      numeros.addAll(cuentaDescendenteRecursiva(numero-1));

      return numeros;
  }



}



