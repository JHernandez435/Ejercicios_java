package ejercicios_52;

import javax.swing.JOptionPane;

public class Ejercicios_52 {

    public static void main(String[] args) {
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO:"));
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LOS VALORES ("+num+"), ES EL SIGUIENTE :");
        
        if (num>=0) {
                        
            JOptionPane.showMessageDialog(null,"EL NUMERO INGRESADO ES POSITIVO:("+num+")");
            
        }else {
            
            JOptionPane.showMessageDialog(null,"EL NUMERO INGRESADO ES POSITIVO:("+num+")"); 
        }
    }
    
}
