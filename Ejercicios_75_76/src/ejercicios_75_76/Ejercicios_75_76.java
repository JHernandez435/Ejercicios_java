package ejercicios_75_76;

import javax.swing.JOptionPane;

public class Ejercicios_75_76 {

    public static void main(String[] args) {
        
        double valor=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor, por el cual se efectua la fianza, por favor"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+valor+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (valor<500.000) {
            
            double A=valor*0.02;
            JOptionPane.showMessageDialog(null,"EL MONTO DE LA CUOTA A PAGAR ES ="+A);
            
        }else{
            
            double D=valor*0.03;
            JOptionPane.showMessageDialog(null,"EL MONTO DE LA CUOTA A PAGAR ES ="+D);
        }
        JOptionPane.showMessageDialog(null,"¡¡GRACIAS!!,Por tu compra");
    }
    
}
