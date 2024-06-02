import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese fecha en formato yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha = format.parse(entrada.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

           Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("Fecha 1 es después que fecha2(actual)");
            }else if(fecha.before(fecha2)){
                System.out.println("fecha es anterior que fecha2(actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fechas iguales");

            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
