package ejercicios_62;

import javax.swing.JOptionPane;

public class Ejercicios_62 {
    
    public static void main(String[] args) {
        
    Double prece=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del pañal por unidad:"));
    Double quantity=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de pañales que va disponer para su beneficio:"));
    
    JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA, EL VALOR DEL PRODUCTO =$("+prece+") LLEVARA LA CANTIDAD DE ("+quantity+") DOCENAS, SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
    
    double reply=prece*quantity;
    
    if(prece>=5) {
            
            double S=reply*0.12;
            double D=reply-S;
          
            JOptionPane.showMessageDialog(null,"EL DESCUENTO DEL 12% EQUIVALE A $"+S
            +"\nEL PRECIO TOTAL A PAGAR ES =$"+D);
         
    }else {
            
            JOptionPane.showMessageDialog(null,"LA CANTIDAD DE PAÑALES("+quantity+"), NO CUMPLEN LA CONDICION PARA GENERAR EL DESCUENTO(20%)"
            +"\nEL PRECIO TOTAL A PAGAR ES =$"+prece);  
            
        } 
        
    }
    
}
