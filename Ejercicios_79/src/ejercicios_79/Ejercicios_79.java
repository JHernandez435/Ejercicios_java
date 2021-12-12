package ejercicios_79;

import javax.swing.JOptionPane;

public class Ejercicios_79 {

    public static void main(String[] args) {
        
        double inversion=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor de la inversion total:"));
        double hipoteca=Double.parseDouble(JOptionPane.showInputDialog(null,"Digte el valor de la hipoteca"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+inversion+"),("+hipoteca+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (inversion<1000000) {
            
            	double A=34000000*0.15,S=A+A;
		JOptionPane.showMessageDialog(null,"EL MONTO QUE DEBE PAGAR ES ="+A+" QUE CORRESPONDE AL 50% "
                +"\nEL MONTO QUE DEBE PAGAR SU SOCIO ES ="+A+" QUE CORRESPONDE AL OTRO 50 PORCIENTO"
                +"\nLA SUMA DE LAS DOS PARTES ES ="+S+" QUE CORRESPONDE A LA TOTALIDAD DE LA INVERSION");        
        }else{
                double D=hipoteca-inversion,F=D/2,G=(F*2)+D;
                JOptionPane.showMessageDialog(null,"EL MONTO QUE DEBE PAGAR ES ="+D
                +"\nQUE CORRESPONDE AL 50% DEL RESTANTE DE LA INVERSION MAS EL VALOR TOTAL DE LA HIPOTECA QUE ES ="+hipoteca
                +"\nEL MONTO QUE DEBE PAGAR SU SOCIO ES ="+F+" QUE CORRESPONDE AL OTRO 50 PORCIENTO"
                +"\nLA SUMA DE LAS DOS PARTES ES ="+G+" QUE CORRESPONDE A LA TOTALIDAD DE LA INVERSION");   
        }
    }
    
}
