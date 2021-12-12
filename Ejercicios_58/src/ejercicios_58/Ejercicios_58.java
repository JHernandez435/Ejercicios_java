package ejercicios_58;

import javax.swing.JOptionPane;

public class Ejercicios_58 {

    public static void main(String[] args) {
        
        String respuesta=JOptionPane.showInputDialog("HOLA, USTED ES CULPABLE O INOCENTE:");
        
        JOptionPane.showMessageDialog(null,"Gracias por su respuesta "+respuesta+",ES LA SIGUIENTE:");
        
        if("culpable".equals(respuesta)) {
            
            JOptionPane.showMessageDialog(null,"SOY CULPABLE,MEREZCO LA CARCEL");
         
            }else {
            
            JOptionPane.showMessageDialog(null,"SOY INOCENTE,MEREZCO IR A CASA");                
        } 
    }
    
}
