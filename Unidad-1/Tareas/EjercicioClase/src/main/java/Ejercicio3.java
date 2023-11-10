public class Ejercicio3 {

    public String calificacionesEstudiantes(int nota) {

        if (nota >= 0 && nota <= 4.99) {
            return "Suspenso";
        } else if (nota >= 5 && nota <= 5.99) {
            return "Aprobado";
        } else if (nota >= 6 && nota <= 6.99) {
            return "Bien";
        } else if (nota >= 7 && nota <= 8.99) {
            return "Notable";
        } else if (nota >= 9 && nota <= 9.99) {
            return "Sobresaliente";
        } else {
            return "Matrírcula";
        }

    }

    public String calificacionesEstudiante(String nota){

        System.out.println("NOTAS DE LOS ALUMNOS");
        System.out.println("En que rango se encuentra tu nota:");
        System.out.println("1: 0-4.99");
        System.out.println("2: 5-5.99");
        System.out.println("3: 6-6.99");
        System.out.println("4: 7-8.99");
        System.out.println("5: 9-9.99");
        System.out.println("6:  10");


        switch (nota){

            case "1":
                return "Suspenso";
            case "2":
                return "Aprobado";
            case "3":
                return "Bien";
            case "4":
                return "Notable";
            case "5":
                return "Sobresaliente";
            case "6":
                return "Matrícula";

            default:
                System.out.println("No es una nota válida");

        }

      return nota;
    }


}