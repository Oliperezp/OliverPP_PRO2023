package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;


    public Persona(){}

    public Persona(String nombre,String fechaNacimiento) throws ParseException{

        this.nombre=nombre;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try{

            this.fechaNacimiento=formato.parse(fechaNacimiento);

        }catch (ParseException exception){

            throw  new ParseException("No es un formato de fecha válido. Debe ser dd/MM/yyyy", exception.getErrorOffset());

        }


    }


    public int calcularEdad(){

        Calendar fechaNacimientoCal = Calendar.getInstance();

        fechaNacimientoCal.setTime(fechaNacimiento);

        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);


      return edad;

    }


    public String signoDelZodiaco(){

        Calendar calendarhoy = Calendar.getInstance();
        calendarhoy.setTime(fechaNacimiento);

        int mes = calendarhoy.get(Calendar.MONTH)+1;

        switch(mes){

            case 1:
                return "Capricornio";
            case 2:
                return "Acuario";
            case 3:
                return "Piscis";
            case 4:
                return "Aries";
            case 5:
                return "Tauro";
            case 6:
                return "Géminis";
            case 7:
                return "Cáncer";
            case 8:
                return "Leo";
            case 9:
                return "Virgo";
            case 10:
                return "Libra";
            case 11:
                return "Escorpio";
            case 12:
                return "Sagitario";
            default:
                return "Desconocido";
        }




    }

    public String mostrarInfo(){

        return "Nombre: " + nombre + "\n" + " Fecha De Nacimiento: " +   fechaNacimiento + "\n" + " Edad: " + calcularEdad() + "\n" + " Signo Del Zodiaco: " + signoDelZodiaco();
    }


    public static void main(String[] args) throws ParseException {

        Persona persona1 = new Persona("Oliver","31/10/1987");

        System.out.println(persona1.mostrarInfo());



    }


}


/*
public class Persona {
    private String nombre;
    private Date fechaDeNacimiento;

    // Constructor que lanza una excepción si el formato de fecha es incorrecto
    public Persona(String nombre, String fechaNacimiento) throws ParseException {
        this.nombre = nombre;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.fechaDeNacimiento = dateFormat.parse(fechaNacimiento);
        } catch (ParseException e) {
            throw new ParseException("Formato de fecha incorrecto. Debe ser dd/MM/yyyy", e.getErrorOffset());
        }
    }

    // Método para calcular la edad
    public int calcularEdad() {
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaDeNacimiento);
        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);

        // Ajuste si aún no ha cumplido años en el año actual
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimientoCal.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return edad;
    }

    // Método para determinar el signo zodiacal
    public String signoDelZodiaco() {
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaDeNacimiento);
        int mes = fechaNacimientoCal.get(Calendar.MONTH) + 1; // Meses en Calendar van de 0 a 11

        switch (mes) {
            case 1:
                return "Capricornio";
            case 2:
                return "Acuario";
            case 3:
                return "Piscis";
            case 4:
                return "Aries";
            case 5:
                return "Tauro";
            case 6:
                return "Géminis";
            case 7:
                return "Cáncer";
            case 8:
                return "Leo";
            case 9:
                return "Virgo";
            case 10:
                return "Libra";
            case 11:
                return "Escorpio";
            case 12:
                return "Sagitario";
            default:
                return "Desconocido";
        }
    }

    // Método para imprimir la información
    public void imprimirInformacion() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimientoFormateada = dateFormat.format(fechaDeNacimiento);

        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimientoFormateada);
        System.out.println("Edad: " + calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + signoDelZodiaco());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento del alumno (formato dd/MM/yyyy):");
        String fechaNacimiento = scanner.nextLine();

        try {
            Persona personaEjemplo = new Persona(nombre, fechaNacimiento);
            personaEjemplo.imprimirInformacion();
        } catch (ParseException e) {
            System.out.println("Error al crear la persona: " + e.getMessage());
        }
    }
}
            */
