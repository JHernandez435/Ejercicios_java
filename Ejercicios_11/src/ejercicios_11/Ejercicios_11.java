package ejercicios_11;

import javax.swing.JOptionPane;

public class Ejercicios_11 {

    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("INGRESE SU NOMBRE:"); 
        String apellido=JOptionPane.showInputDialog("INGRESE SU APELLIDO:");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD:"));
        JOptionPane.showMessageDialog(null,"Su nombre es "+nombre+" "+apellido+"\nSu edad es "+edad);
    }
    
}
