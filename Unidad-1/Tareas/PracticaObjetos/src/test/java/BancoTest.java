import ies.puerto.Banco;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BancoTest {

    Banco banco = new Banco(887545,"Manolo",1780);

    @Test
    public void comprobarIngresoOk(){
        double resultado=banco.agregarSaldo(200);
        double resultadoOk=1980;

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");

    }


    @Test
    public void comprobarRetiroSaldoOk(){
        double resultado=banco.retirarSaldo(200);
        double resultadoOk=1580;

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");

    }

@Test
    public void comprobarMostrarSaldoOk(){

        String resultado= banco.mostrarSaldoActual();
        String resultadoOk="Saldo:" + "1780.0";

        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }


}
