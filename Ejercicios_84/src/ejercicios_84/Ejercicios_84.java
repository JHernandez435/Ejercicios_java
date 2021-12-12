package ejercicios_84;

import javax.swing.JOptionPane;

public class Ejercicios_84 {

    public static void main(String[] args) {
       
        int dia=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL DIA PARA PAGAR LA PENSION DEL COLEGIO :"));
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+dia+");"
                + "\nSEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (dia<=15) {
            
            JOptionPane.showMessageDialog(null,"EL VALOR A PAGAR DE LA PENSION ES IGUAL A $166.500"); 
            
        }else{
            double A=166500*0.15,S=166500+A;
	    
            JOptionPane.showMessageDialog(null,"LA TARIFA A PAGAR DE LA PENSION ES IGUAL A "+S
            +"\nSUBIO POR HABERLA PAGADO EL ("+dia+")");
            
        }
    }
    
}
