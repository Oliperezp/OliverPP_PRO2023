public class Ejercicio3 {

    public String calificacionesEstudiantes(double nota) {

        String resultado="";

        if (nota >= 0 && nota <= 4.99) {
            resultado= "Suspenso";
        } else if (nota >= 5 && nota <= 5.99) {
            resultado= "Aprobado";
        } else if (nota >= 6 && nota <= 6.99) {
            resultado= "Bien";
        } else if (nota >= 7 && nota <= 8.99) {
            resultado= "Notable";
        } else if (nota >= 9 && nota <= 9.99) {
            resultado="Sobresaliente";
        } else if (nota == 10) {
            resultado= "Matrícula";
        }
        return resultado;
    }

    public String calificacionesEstudiante(float nota){

        String resultado="";

        int enteroNota=(int)nota;

       switch (enteroNota){

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                resultado="Suspenso";
                break;

            case 5:
                resultado="Aprobado";
               break;


            case 6:
               resultado="Bien";
                break;

           case 7:
           case 8:
               resultado="Notable";
               break;


           case 9:
               resultado="Sobresaliente";
               break;

           case 10:

               resultado="Matricula";
               break;

            default:
                resultado="No es una nota válida";
                break;

        }


        return resultado;
    }


}