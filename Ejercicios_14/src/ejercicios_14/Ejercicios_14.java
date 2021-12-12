package ejercicios_14;

import javax.swing.JOptionPane;

public class Ejercicios_14 {

    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("INGRESE SU NOMBRE:"); 
        String apellido=JOptionPane.showInputDialog("INGRESE SU APELLIDO:");
        String direccion=JOptionPane.showInputDialog("INGRESE SU DIRECCION:");
        String telefono=JOptionPane.showInputDialog("INGRESE SU TELEFONO:");
        JOptionPane.showMessageDialog(null,"Su nombre es "+nombre+" "+apellido+"\nSu edad es "+telefono+"años"+"\nSu direccion: "+direccion);
    }
    
}
