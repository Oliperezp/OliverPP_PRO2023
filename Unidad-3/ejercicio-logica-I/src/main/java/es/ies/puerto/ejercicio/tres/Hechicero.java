package es.ies.puerto.ejercicio.tres;

import java.util.*;

public class Hechicero {


    public char vocalMasPoderosa(String texto) {

        int [] cantidadLetras = new int[5];

        char vocal = ' ';
        int contadorA=0;
        int contadorE=0;
        int contadorI=0;
        int contadorO=0;
        int contadorU=0;

        int tamanioTexto = texto.length()-1;

        for (int i = 0; i < tamanioTexto; i++) {

            vocal = texto.charAt(i);

            switch (vocal){

                case 'a': case 'A':
                    contadorA++;
                    break;
                case 'e': case'E':
                    contadorE++;
                    break;
                case 'i': case'I':
                    contadorI++;
                    break;
                case 'o': case'O':
                    contadorO++;
                    break;
                case 'u': case'U':
                    contadorU++;
                    break;

            }

        }

        cantidadLetras[0]=contadorA;
        cantidadLetras[1]=contadorE;
        cantidadLetras[2]=contadorI;
        cantidadLetras[3]=contadorO;
        cantidadLetras[4]=contadorU;

        Arrays.sort(cantidadLetras);

        int letraMasRepetida=cantidadLetras[4];



       return vocal;
    }
}
