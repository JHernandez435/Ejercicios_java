package ejercicios_83;

import javax.swing.JOptionPane;

public class Ejercicios_83 {

    public static void main(String[] args) {
        
        int puesto=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL NUMERO DE PASAJEROS:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+puesto+");"
                + "\nSEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
   	
        
        if (puesto>150.000) {
            
            double A=30000*0.05,S=A*puesto,D=A-S;
            JOptionPane.showMessageDialog(null,"LA TARIFA TOTAL ES =$"+S
            +"\nEL DESCUENTO EQUIVALE AL ="+A+" LA TARIFA TOTAL MENOS EL DESCUENTO ES  =$"+D);       
            
        }else{
            double F=30000*puesto;
            JOptionPane.showMessageDialog(null,"LA TARIFA TOTAL ES =$"+F);
        }
    }
    
}
