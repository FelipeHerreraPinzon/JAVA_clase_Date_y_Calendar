import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularMilisegundos {
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

        long j = 0;
        for(int i = 0; i < 100000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fechaFin = new Date();
        long tiempoFinal = fechaFin.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for " + tiempoFinal);
        System.out.println("fecha Str = " + fechaStr);

    }
}
