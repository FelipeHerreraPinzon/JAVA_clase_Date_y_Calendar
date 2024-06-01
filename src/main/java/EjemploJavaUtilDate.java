import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        // obtener fecha y hora
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        // formatear / personalizar

        // DIA MES(LETRAS) AÑO
        //SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        //SimpleDateFormat df = new SimpleDateFormat("dd MM yyyy");
       // SimpleDateFormat df = new SimpleDateFormat("dd - MMMM - yyyy");
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String fechaStr = df.format(fecha);

        System.out.println("fecha Str = " + fechaStr);

    }
}
// API Reference
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html