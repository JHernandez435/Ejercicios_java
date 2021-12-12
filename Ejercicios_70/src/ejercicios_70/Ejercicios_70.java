package ejercicios_70;

import javax.swing.JOptionPane;

public class Ejercicios_70 {

    public static void main(String[] args) {
        
        String article= JOptionPane.showInputDialog("1) INGRESE EL NOMBRE DEL ARTICULO:");
        int clave=Integer.parseInt(JOptionPane.showInputDialog("2) INGRESE LA CLAVE DEL ARTICULO:"
        +"\nRECUERDE: \nCLAVE:1=10 PORCIENTO: \nCLAVE:2=20 PORCIENTO:"));
        double price=Double.parseDouble(JOptionPane.showInputDialog("3) INGRESE EL PRECIO DEL ARTICULO:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+article+"), clave:("+clave+"), $("+price+"),"
        +" SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (clave==0 || clave>=3 ) {
            
            JOptionPane.showMessageDialog(null,"¡¡¡ ERROR !!!, DIGITO UNA CLAVE QUE NO CUMPLE CON LA CONDICION","",JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            if (clave==1) {
                double A=price*0.10,S=A-price;
		JOptionPane.showMessageDialog(null,"EL MONTO CORRESPONDIENTE AL DESCUENTO ES EQUIVALENTE A"+A);
                JOptionPane.showMessageDialog(null,"EL PRECIO CON SU RESPECTIVO DESCUENTO (10%) ES =$"+S);
                
            }else{
                double D=price*0.20,F=D-price;
		JOptionPane.showMessageDialog(null,"EL MONTO CORRESPONDIENTE AL DESCUENTO ES EQUIVALENTE A"+D);
                JOptionPane.showMessageDialog(null,"EL PRECIO CON SU RESPECTIVO DESCUENTO (10%) ES =$"+F);
            }
        }
    }
    
}
