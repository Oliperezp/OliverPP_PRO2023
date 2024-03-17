package es.ies.puerto.examen.logica.cuatro;

import org.simpleframework.xml.util.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pergamino {


    //Busca el número total de palabras como un elfo contando estrellas en el cielo.
    //Calcula la longitud media de las palabras como el sabio en la biblioteca de Alejandría.
    //Cuenta las oraciones del texto como el guardián de los portales dimensionales.
    //Encuentra la palabra más larga como un guerrero buscando la legendaria espada en el bosque encantado.
    Pergamino() {

    }

    Object[] analizador(String texto) {

        float mediaPalabras=0f;
        String palabraMasLarga="";
        int contadorPalabras=0;
        int contadorOraciones=0;



        Object[] resultado = null;

        String regex = "\\.";
        Pattern pattern = Pattern.compile(regex);

        int tamanio=texto.length()-1;


        for (int i = 0; i < tamanio; i++) {



            resultado= texto.split("");
            contadorPalabras++;
            resultado[0]=contadorPalabras;


            mediaPalabras+=contadorPalabras;
            resultado[1]=mediaPalabras/tamanio;



            resultado=texto.split(".");
            contadorOraciones++;
            resultado[2]=contadorOraciones;




            resultado[3]=palabraMasLarga;

        }



        return resultado;
    }

}
