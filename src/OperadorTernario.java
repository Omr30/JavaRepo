import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
//        variable = condicion ? si es verdadero : si es falso;
        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa la nota de matematicas entre 2.0 - 7.0");
        matematicas = scan.nextDouble();

        System.out.println("Ingresa la nota de ciencias entre 2.0 - 7.0");
        ciencias = scan.nextDouble();

        System.out.println("Ingresa la nota de historia entre 2.0 - 7.0");
        historia = scan.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);
    }
}
