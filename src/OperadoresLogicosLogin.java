import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
//        String [] usernames = new String[3];
//        String [] passwords = new String[3];
//        usernames[0] = "oscar";
//        passwords[0] = "12345";
//
//        usernames[1] = "admin";
//        passwords[1] = "12345";
//
//        usernames[2] = "pepe";
//        passwords[2] = "12345";

        String [] usernames = {"oscar", "admin", "pepe"};
        String [] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String nameUser = scanner.next();

        System.out.println("Ingrese el password");

        String passUser = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equals(nameUser) && passwords[i].equals(passUser)) ? true : esAutenticado;

            /*if(usernames[i].equals(nameUser) && passwords[i].equals(passUser)) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Estas Logueado ".concat(nameUser).concat("!")
                                       : "Usuario o contraseña incorrecto!\nIntentalo nuevamente";
        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado) {
            System.out.println("Estas Logueado ".concat(nameUser).concat("!"));
        }else {
            System.out.println("Usuario o contraseña incorrecto");
            System.out.println("Intentalo nuevamente");
        }*/

    }
}
