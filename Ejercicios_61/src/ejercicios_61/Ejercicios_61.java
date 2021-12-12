package ejercicios_61;

import javax.swing.JOptionPane;

public class Ejercicios_61 {

    public static void main(String[] args) {
        
        double z=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del primer producto:"));
        double x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del segundo producto:"));
        double c=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del tercer producto:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ($"+z+")"+"($"+x+")"+"($"+c+") SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        double A=(z+x+c);
        
        if(A==200.000) {
            
            double S=A*0.20;
	    double D=A-S;
          
            JOptionPane.showMessageDialog(null,"EL DESCUENTO DEL 20% EQUIVALE A $"+S
            +"\nEL PRECIO TOTAL A PAGAR ES =$"+D);
         
        }else {
            
            JOptionPane.showMessageDialog(null,"LA SUMA DE PRECIOS DE LOS TRES PRODUCTOS ¡NO! CUMPLE LA CONDICION PARA GENERAR EL DESCUENTO(20%)" 
            +"\nEL PRECIO TOTAL A PAGAR ES =$"+A);  
            
        } 
        
    }
    
}
