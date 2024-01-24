package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperacionesArrayList {


    public static int empiezaPorA(List<String> cadenas) {
        int contador = 0;
        String regex = "^[aA].*";
        Pattern pattern = Pattern.compile(regex);

        for (String cadena : cadenas) {

            Matcher matcher = pattern.matcher(cadena);
            if (matcher.matches()) {
                contador++;
            }
        }

        return contador;
    }

}
