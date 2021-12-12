package ejercicios_46;

import javax.swing.JOptionPane;

public class Ejercicios_46 {

    public static void main(String[] args) {
        
        int azar = (int) (Math.random()*100+1);
        
        if (azar<=50) {
            JOptionPane.showMessageDialog(null,"EL NUMERO ES MENOR QUE (50) ="+azar);
            
        }else {
            JOptionPane.showMessageDialog(null,"EL NUMERO ES MAYOR QUE (50) ="+azar);
           
        }
    }
    
}
