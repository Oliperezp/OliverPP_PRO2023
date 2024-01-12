package ies.puerto.acceso;

import ies.puerto.Excepciones.ValidacionException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autentificacion extends ValidacionException {

    //Crea un paquete acceso con una clase Autenticacion que contenga métodos para validar credenciales de usuarios.
    // Utiliza esta clase en el paquete modelo para añadir funcionalidades de autenticación a las clases Persona y Estudiante.


    public Autentificacion(){}


    public String validarDni(String dni) throws ValidacionException{

        String respuesta="";



        String regex = "[0-9]{8}[a-z A-Z]{1}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()) {
            respuesta="El dni es Válido";
        }else{
            throw new ValidacionException(432,"No es un Dni Válido");
        }

       return respuesta;
    }


    public String mayorEdad(int edad){
        if(edad<18){
            return "Esta persona es menor de edad";
        }else{
            return "Esta persona es mayor de edad";
        }

    }

    public String validarNombre(String nombre) throws ValidacionException{
        String regex="[a-zA-Z]+";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);

        if(matcher.matches()){
            return "El nombre es correcto";
        }else{
            throw new ValidacionException(345,"No es un nombre válido");
        }

    }



}
