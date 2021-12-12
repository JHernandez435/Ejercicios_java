package ejercicios_86;

import javax.swing.JOptionPane;

public class Ejercicios_86 {

    public static void main(String[] args) {
        
        int edad_1=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE LA EDAD DEL PRIMER HERMANO:"));
        int edad_2=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE LA EDAD DEL SEGUNDO HERMANO:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+edad_1+"),("+edad_2+");"
        + "\nSEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (edad_1>edad_2) {
            
            int A=edad_1-edad_2;
            JOptionPane.showMessageDialog(null,"EL HERMANO MAYOR TIENE "+edad_1+" AÑOS;"
            +"\nY LA DIFENCIA QUE LE LLEVA AL MENOR ES DE "+A+" AÑOS");
            
        }else{
            int B=edad_2-edad_1;
            JOptionPane.showMessageDialog(null,"EL HERMANO MAYOR TIENE "+edad_1+" AÑOS;"
            +"\nY LA DIFENCIA QUE LE LLEVA AL MENOR ES DE "+B+" AÑOS");
        }
    }
    
}
