package ejercicios_66;

import javax.swing.JOptionPane;

public class Ejercicios_66 {


    public static void main(String[] args) {
               
        double monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a invertir,por favor:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+monto+")"+", SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        double A=monto*0.70;
        
        if(A<=70000) {
                    
            JOptionPane.showMessageDialog(null,"EL INTERES NO SOBREPASA LA CONDICION DEL USUARIO ES ="+A);
         
        }else{
            
            JOptionPane.showMessageDialog(null,"EL INTERES SOBREPASA LA COMDICION DEL USUARIO ES ="+A); 

        }  
    }
    
}
