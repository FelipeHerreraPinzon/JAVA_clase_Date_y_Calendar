import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();


         // personalizar hora
        //  calendario.set(2024, 5, 20, 20, 25, 7);
        //  calendario.set(1970, Calendar.APRIL, 20, 20, 25, 7);

        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
       // calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        // formatear la fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);

    }
}
