public class OperadoresIncrementales {
    public static void main(String[] args) {
        // Pre Incremento
        int i = 1;
        int j = ++i; // i = i + 1  se incrementa y luego se asigna

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post Incremento
        i = 2;
        j = i++; // primero se asigna luego se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
