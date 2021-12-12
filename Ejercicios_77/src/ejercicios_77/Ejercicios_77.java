package ejercicios_77;

import javax.swing.JOptionPane;

public class Ejercicios_77 {

    public static void main(String[] args) {
        
        double note=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el promedio total de las calificaciones de una materia"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+note+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (note>=4.5) {
            
            double A=828.116*0.30,B=828.116-A;
            JOptionPane.showMessageDialog(null,"EL MONTO DE LA CUOTA A PAGAR ES ="+B);
            
        }else{
            
            double S=828.116*0.10,D=828.116-S;
            JOptionPane.showMessageDialog(null,"EL ALUMNO DEBERA PAGAR POR SU MATRICULA UN EQUIALENTE ="+D);
          
        }
    }
    
}
