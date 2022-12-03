import java.util.Scanner;

public class MultiplicarSinUsarX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primerNumero = 0;
        int segundoNumero = 0;
        int resultado = 0;

        System.out.println("Ingresar dos numeros enteros positvos o negativos para multiplicarlos");
        System.out.println("Ingresa el primer numero:");
        primerNumero = sc.nextInt();

        System.out.println("Ingresa el segundo numero:");
        segundoNumero = sc.nextInt();

        System.out.println("La multiplicacion de " + primerNumero + " * " + segundoNumero + " es:");

        if(primerNumero>0 && segundoNumero>0) {
            for(int i=1; i<=segundoNumero; i++){
                resultado += primerNumero;
            }
        }else if(primerNumero<0 && segundoNumero>0){
            for(int i=1; i<=segundoNumero; i++) {
                resultado += (-primerNumero);
            }
        }else if(primerNumero>0 && segundoNumero<0){
            for(int i=1; i<= (-segundoNumero); i++){
                resultado += primerNumero;
            }
        }else if(primerNumero<0 && segundoNumero<0) {
            for (int i = 1; i <= (-segundoNumero); i++) {
                resultado += (-primerNumero);
            }
        }


        System.out.println("resultado = " + resultado);
    }
}
