package es.ies.puerto.examen.logica.dos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class SAnillo {
    final String expresionRegular = "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
    private final String fechaEstreno = "17/12/2003";
    Date dFechaEstreno = null;
    private final String formatDate = "dd/MM/yyyy";
    SimpleDateFormat dateFormat;

    public SAnillo() {
        dateFormat = new SimpleDateFormat(formatDate);
        try {
            dFechaEstreno = dateFormat.parse(fechaEstreno);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public long obtenerDiasDesdeRetornoRey(String fecha)  {

        Date fechaIntroducida=null;
        SimpleDateFormat formatoFechaIntroducida=new SimpleDateFormat("\"dd/MM/yyyy\"");

        if(fecha==null){
            return -1;
        }

        try {
            fechaIntroducida=formatoFechaIntroducida.parse(fecha);
        } catch (ParseException e) {
            return -1;
        }


        Calendar calendarFecha = Calendar.getInstance();
        calendarFecha.setTime(fechaIntroducida);

        Calendar fechaEstrenoCalendar = Calendar.getInstance();
        fechaEstrenoCalendar.setTime(dFechaEstreno);

        long tiempo = calendarFecha.getTimeInMillis() - fechaEstrenoCalendar.getTimeInMillis();

        return (int) (tiempo/(1000*60*60*24));
    }

}
