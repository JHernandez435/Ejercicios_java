
package ejercicios_57;

import javax.swing.JOptionPane;

public class Ejercicios_57 {

    public static void main(String[] args) {
        
        int actual=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL AÑO ACTUAL:"));
        int año=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN AÑO DIFRENTE:"));
        
        JOptionPane.showMessageDialog(null,"LA CORREPONDIENTE OPERACION CON LOS VALORES "+actual+" Y "+año);
        
        int reply_1=año-actual;
        int reply_2=actual-año;
        
        if(año>actual) {
            
            JOptionPane.showMessageDialog(null,"LOS AÑOS FALTANTES PARA LLEGAR A ESE AÑO SON ="+reply_1);
         
            }else {
            
            JOptionPane.showMessageDialog(null,"LOS AÑOS FALTANTES PARA LLEGAR A ESE AÑO SON ="+reply_2);                
        } 
    }
    
}
