import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TareaCalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una fecha para calcular tu edad con este formato yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date fecha = format.parse(sc.next());
            Date fecha2 = new Date();

            int yearsInBetween = fecha2.getYear() - fecha.getYear();
            System.out.println("La edad que tienes es " + yearsInBetween);

        }catch (ParseException e){
            throw new RuntimeException(e);
        }
    }
}
