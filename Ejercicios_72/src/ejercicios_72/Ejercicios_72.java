package ejercicios_72;

import javax.swing.JOptionPane;

public class Ejercicios_72 {

    public static void main(String[] args) {
        
        double quantity=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CANTIDAD TOTAL DE LLANTAS,POR FAVOR"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+quantity+"),SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        double A=quantity*70.000,S=quantity*80.000;
	        
        if (quantity<5) {
            
            JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL DE LA COMPRRA ES =$"+A);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"EL PRECIO TOTAL DE LA COMPRRA ES =$"+S);
            
        }
        JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
    }
    
}
