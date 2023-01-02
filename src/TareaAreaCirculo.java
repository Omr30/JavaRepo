import java.util.Scanner;

public class TareaAreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el area de un circulo para calcular su área");
        double radio = sc.nextDouble();

        double area = Math.PI*(Math.pow(radio, 2));

        System.out.println("El área de este circulo es = " + area);
    }
}
