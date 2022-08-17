import java.util.Scanner;

public class MedidorDeGasolina {
    public static void main(String[] args) {
        double capGas;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de litros actual del estanque de gasolina(recuerda que la capacidad maxima es de 70 litros)");
        capGas = scan.nextDouble();

        if (capGas == 70){
            System.out.println("Estanque lleno");
        } else if (capGas < 70 && capGas >= 60) {
            System.out.println("Estanque casi lleno");
        } else if (capGas < 60 && capGas >= 40) {
            System.out.println("Estanque  3/4");
        } else if (capGas < 40 && capGas >= 35) {
            System.out.println("Medio Estanque");
        } else if (capGas < 35 && capGas >= 20) {
            System.out.println("Suficiente");
        } else if (capGas < 20 && capGas >= 1) {
            System.out.println("Insuficiente");
        }

    }
}
