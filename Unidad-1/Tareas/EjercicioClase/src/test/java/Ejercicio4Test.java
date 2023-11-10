import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio4Test {

Ejercicio4 ejercicio4 = new Ejercicio4("Manolo",1200);

@Test
public void comprobarIngresoOkTest(){
    int resultadoOk=1300;
    double resultado=ejercicio4.depositarDinero(100);
    Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
}

    @Test
    public void comprobarReintegroOkTest(){
        int resultadoOk=200;
        double resultado=ejercicio4.retirarSaldo(1000);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void comprobarImprimirOkTest(){

    String resultadoOk="Titular:" + "Manolo" + "Saldo:" + "1200.0";
    String resultado=ejercicio4.mostrarSaldo();

    Assertions.assertEquals(resultadoOk,resultado,"No es el mensaje esperado");

    }


}
