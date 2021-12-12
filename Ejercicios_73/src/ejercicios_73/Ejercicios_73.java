package ejercicios_73;

import javax.swing.JOptionPane;

public class Ejercicios_73 {

    public static void main(String[] args) {
        
        double price=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL VALOR DE LA COMPRA, POR FAVOR:"));
        int azar=(int) (Math.random()*148);
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+price+"), EL NUMERO AL AZAR FUE: ("+azar+")"
        + "\nSEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        double A=price*0.15,S=price*0.20;
        
        if (price<74) {
            
            JOptionPane.showMessageDialog(null,"EL VALOR DEL DESCUENTO ES EQUIVALENTE(15%) ES =$"+A);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"EL VALOR DEL DESCUENTO ES EQUIVALENTE(20%) ES =$"+S);
            
        }
        JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
    }
    
}
