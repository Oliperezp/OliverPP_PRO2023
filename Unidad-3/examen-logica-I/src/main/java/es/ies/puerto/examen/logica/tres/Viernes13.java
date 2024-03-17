package es.ies.puerto.examen.logica.tres;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Viernes13 {

    SimpleDateFormat dateFormat;
    public boolean esElFinDelMundo(Date fecha) {

        if(fecha==null){
            return false;
        }

        dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        Calendar fechaIntroducida = Calendar.getInstance();
        fechaIntroducida.setTime(fecha);

        if(fechaIntroducida.DAY_OF_MONTH==13 && Calendar.DAY_OF_WEEK==6){
            return true;
        }
        return false;
    }






}
