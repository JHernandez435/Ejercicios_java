package ejercicios_49;

import javax.swing.JOptionPane;

public class Ejercicios_49 {

    public static void main(String[] args) {
        
        int edad=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU EDAD CORRESPONDIENTE:"));
        
        if (edad>=18) {
                        
            JOptionPane.showMessageDialog(null,"EL USUARIO ES MAYOR DE EDAD: "+edad+" años");
            
        }else {
            
            JOptionPane.showMessageDialog(null,"EL USUARIO ES MENOR DE EDAD: "+edad+" años"); 
            
        }  
    }
    
}
