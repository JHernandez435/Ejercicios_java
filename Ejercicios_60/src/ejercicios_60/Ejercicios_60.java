package ejercicios_60;

import javax.swing.JOptionPane;

public class Ejercicios_60 {

    public static void main(String[] args) {
        
    int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto por unidad:"));
    int z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor, de la cantidad de docenas que va a llevar:"));
    
    JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA, EL VALOR DEL PRODUCTO =$("+x+") LLEVARA LA CANTIDAD DE ("+z+") DOCENAS, SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
    
    int A=z*12;
    
    if(A>=36) {
            
        int reply_1=x*z;
        double reply_2=reply_1*0.15;
        double reply_3=reply_1-reply_2;
                
            JOptionPane.showMessageDialog(null,"El MONTO DE LA COMPPRA ES =$"+reply_1    
            +"\nEl DESCUENTO(15%), DEL MONTO DE LA COMPPRA ES $="+reply_2
            +"\nEl MONTO A PAGAR ES =$"+reply_3);
            
    }if(A>=48) {
            
        int reply_4=(z/2);
        
            JOptionPane.showMessageDialog(null,"Por tu compra de ("+z+") docenas recibes ("+reply_4+") obsequio(s)");
            
            }else {
        
        int reply_5=x*z;
	double reply_6=reply_5*0.10;
	double reply_7=reply_5-reply_6;
		
            JOptionPane.showMessageDialog(null,"El MONTO DE LA COMPPRA ES =$"+reply_5
            +"\nEl DESCUENTO(10%), DEL MONTO DE LA COMPPRA ES =$"+reply_6
            +"\nEl MONTO A PAGAR ES =$"+reply_7); 
                        
            
        } 
    }
    
}
