import ies.puerto.Banco;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BancoTest {

    Banco banco = new Banco(887545,"Manolo",1780);

    @Test
    public void comprobarIngresoOk(){
        double resultado=banco.agregarSaldo(200);
        double resultadoOk=500;

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");

    }


    @Test
    public void comprobarRetiroSaldoOk(){
        double resultado=banco.retirarSaldo(200);
        double resultadoOk=1580;

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");

    }




}
