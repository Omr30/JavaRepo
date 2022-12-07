import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(1970, 0, 25, 24, 20, 10);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
    }
}
