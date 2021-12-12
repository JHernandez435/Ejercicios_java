package ejercicios_81;

import javax.swing.JOptionPane;

public class Ejercicios_81 {

    public static void main(String[] args) {
       
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su respectiva edad"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+edad+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (edad>17) {
            JOptionPane.showMessageDialog(null,"PUEDES JUGAR EN LA CATEGORIA JUVENIL ("+edad+") AÑOS");
        }else{
            JOptionPane.showMessageDialog(null,"PUEDES JUGAR EN LA CATEGORIA JUVENIL ("+edad+") AÑOS");
        }
    }
    
}
