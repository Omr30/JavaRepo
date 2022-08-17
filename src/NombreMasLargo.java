import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String [] persona1 = new String[2];
        String [] persona2 = new String[2];
        String [] persona3 = new String[2];

        persona1[0] = JOptionPane.showInputDialog("Ingresa el nombre de la persona 1");
        persona1[1] = JOptionPane.showInputDialog("Ingresa el apellido de la persona 1");

        persona2[0] = JOptionPane.showInputDialog("Ingresa el nombre de la persona 2");
        persona2[1] = JOptionPane.showInputDialog("Ingresa el apellido de la persona 2");

        persona3[0] = JOptionPane.showInputDialog("Ingresa el nombre de la persona 3");
        persona3[1] = JOptionPane.showInputDialog("Ingresa el apellido de la persona 3");

        int lengPersona1, lengPersona2, lengPersona3;
        lengPersona1 = (persona1[0] + persona1[1]).length();
        lengPersona2 = (persona2[0] + persona2[1]).length();
        lengPersona3 = (persona3[0] + persona3[1]).length();

        if (lengPersona1 > lengPersona2 && lengPersona1 > lengPersona3){
            JOptionPane.showMessageDialog(null,persona1[0] + " " + persona1[1] + " tiene el nombre mas largo.");
        } else if (lengPersona2 > lengPersona1 && lengPersona2 > lengPersona3) {
            JOptionPane.showMessageDialog(null,persona2[0] + " " + persona2[1] + " tiene el nombre mas largo.");
        } else if (lengPersona3 > lengPersona1 && lengPersona3 > lengPersona2) {
            JOptionPane.showMessageDialog(null,persona3[0] + " " + persona3[1] + " tiene el nombre mas largo.");
        }

    }
}
