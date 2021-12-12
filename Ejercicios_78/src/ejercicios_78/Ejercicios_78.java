package ejercicios_78;

import javax.swing.JOptionPane;

public class Ejercicios_78 {

 
    public static void main(String[] args) {
        
        double ingreso=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el promedio total de las calificaciones de una materia"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+ingreso+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (ingreso<800.000) {
            
            	double A=34000000*0.15,B=34000000-A,F=B/120;
		JOptionPane.showMessageDialog(null,"EL MONTO DE LA CUOTA INICIAL A PAGAR ES ="+A
                +"\nEL MONTO MENSUAL ES ="+F);           
        }else{
                double S=34000000*0.30,D=34000000-S,G=D/120;
                JOptionPane.showMessageDialog(null,"EL MONTO DE LA CUOTA INICIAL A PAGAR ES ="+S
                +"\nEL MONTO MENSUAL ES ="+G);    
		
        }
    }
    
}
