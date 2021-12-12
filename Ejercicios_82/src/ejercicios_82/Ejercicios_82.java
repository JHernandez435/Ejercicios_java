package ejercicios_82;

import javax.swing.JOptionPane;

public class Ejercicios_82 {

    public static void main(String[] args) {
        
        double price=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el precio unitario del producto"));
        double quantity=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la cantidad de la venta"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+price+"),("+quantity+");"
                + "SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        double A=price*quantity;
		
        
        if (A>150.000) {
            double S=A*0.07,D=price-S;
            JOptionPane.showMessageDialog(null,"EL PRECIO PARCIAL ES ="+A+"EL PRECIO NETO ES ="+D);
            
        }else{
            JOptionPane.showMessageDialog(null,"EL PRECIO PARCIAL ES ="+A+"EL PRECIO NETO ES ="+A
            +"\nEL PRECIO PARCIAL NO CUMPLE LA CONDICION PARA OBTENER EL DESCUENTO");
        }
    }
    
}
