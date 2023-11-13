
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

Ejercicio4 ejercicio4 = new Ejercicio4("Manolo",1200);

@Test
public void comprobarIngresoOkTest(){
    boolean resultadoOk=true;
    boolean resultado=ejercicio4.depositarDinero(100);
    Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
}

    @Test
    public void comprobarReintegroOkTest(){
        boolean resultadoOk=true;
        boolean resultado=ejercicio4.retirarSaldo(1000);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void comprobarImprimirOkTest(){

    String resultadoOk="Titular:" + "Manolo" + "Saldo:" + "1200.0";
    String resultado=ejercicio4.mostrarSaldo();

    Assertions.assertEquals(resultadoOk,resultado,"No es el mensaje esperado");

    }


}
