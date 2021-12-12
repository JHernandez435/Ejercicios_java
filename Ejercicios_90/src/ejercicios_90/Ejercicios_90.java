package ejercicios_90;

import javax.swing.JOptionPane;

public class Ejercicios_90 {

    public static void main(String[] args) {
        
            double nota=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE LA NOTA FINAL DEL EXAMEN:")); 
                                       
                    if (nota<=3.0) {
                        JOptionPane.showMessageDialog(null,"BAJO ="+nota);
                    }
                    else if (nota>=3.0 && nota<=3.7) {
                        JOptionPane.showMessageDialog(null,"BASICO ="+nota);
                    }    
                    else if (nota>=3.8 && nota<=4.2) {
                        JOptionPane.showMessageDialog(null,"ALTO ="+nota);
                    }    
                    else if (nota>=4.3 && nota<=5.0) {
                        JOptionPane.showMessageDialog(null,"SUPERIOR ="+nota);
                    }     
            
    }
    
}
