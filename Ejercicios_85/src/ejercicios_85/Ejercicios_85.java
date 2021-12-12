package ejercicios_85;

import javax.swing.JOptionPane;

public class Ejercicios_85 {

    public static void main(String[] args) {
        
        int jean=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL NUMERO DE JEANS QUE VA LLEAR:"));
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+jean+");"
                + "\nSEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (jean>2) {
            double A=125000*0.30,S=125000-A;
	    
            JOptionPane.showMessageDialog(null,"EL VALOR A PAGAR POR SU COMPRA ES IGUAL A "+S+" CON DESCUENTO INCLUIDO");
            
        }else{
            	    
            JOptionPane.showMessageDialog(null,"EL VALOR A PAGAR ES IGUAL A $125000;"
                  + "\nSE QUEDO SIN DESCUENTO POR NO LLEVAR MAS");
            
        }
    }
    
}
