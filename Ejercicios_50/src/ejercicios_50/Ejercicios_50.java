package ejercicios_50;

import javax.swing.JOptionPane;

public class Ejercicios_50 {

    public static void main(String[] args) {
        
        int edad=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU EDAD CORRESPONDIENTE:"));
        
        if (edad>=18) {
                        
            JOptionPane.showMessageDialog(null,"EL USUARIO ES MAYOR DE EDAD Y ES APTO PARA VOTAR: "+edad+" años");
            
        }else {
            
            JOptionPane.showMessageDialog(null,"EL USUARIO ES MENOR DE EDAD Y NO ES APTO PARA VOTAR: "+edad+" años"); 
            
        }  
    }
    
}
