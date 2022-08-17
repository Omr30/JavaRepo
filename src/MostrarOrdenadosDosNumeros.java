import java.util.*;

public class MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar el primer numero:");
        numero1 = scan.nextInt();

        System.out.println("Ingresar el segundo numero:");
        numero2 = scan.nextInt();

        Integer [] numeros = {numero1, numero2};

        Arrays.sort(numeros, Collections.reverseOrder());

        for (int n : numeros){
            System.out.println("\n" + n);
        }

    }
}
