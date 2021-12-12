package ejercicios_88;

import javax.swing.JOptionPane;

public class Ejercicios_88 {

    public static void main(String[] args) {
        
         String nombre=JOptionPane.showInputDialog(null,"INGRESE EL NOMBRE DE USUARIO :");
         int quatity=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE LA CANTIDAD DE LLANTAS:"));
         
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+nombre+"),("+quatity+");"
        + "\nSEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
         
         if (quatity>12) {
             
        double A=229.900-0.20,S=A*quatity,D=A-S;
	JOptionPane.showMessageDialog(null,"COMPRADOR "+nombre
        +"\nLA CANTIDAD DE LLANTAS ="+quatity
        +"\nLA TOTALIDAD A PAGAR ES ="+D);	
            
        }else{
           double Q=200.000-0.25,W=Q*quatity,F=Q-W;
	JOptionPane.showMessageDialog(null,"COMPRADOR "+nombre
        +"\nLA CANTIDAD DE LLANTAS ="+quatity
        +"\nLA TOTALIDAD A PAGAR ES ="+F);  
        }
    }
    
}
