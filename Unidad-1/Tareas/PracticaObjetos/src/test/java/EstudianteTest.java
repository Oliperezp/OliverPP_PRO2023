import ies.puerto.Estudiante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

    Estudiante estudiante = new Estudiante();

    @Test
    public void comprobarPromedioTestOk(){

        double promedio = estudiante.calcularPromedio();
        double resultadoOk=4.866666555404663;

        Assertions.assertEquals(resultadoOk,promedio,"No es el resultado esperado");

    }







}
