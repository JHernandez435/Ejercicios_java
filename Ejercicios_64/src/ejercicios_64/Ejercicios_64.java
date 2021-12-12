package ejercicios_64;

import javax.swing.JOptionPane;

public class Ejercicios_64 {

    public static void main(String[] args) {
        
        double first=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota correspondiente:"));
        double second=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota correspondiente:"));
        double third=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota correspondiente:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+first+")"+"("+second+")"+"("+third+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (first<5.0 & second<5.0 & third<5.0) {
            
            double A=(first+second+third)/3;
            
        if(A>=3.5) {
                    
            JOptionPane.showMessageDialog(null,"EL ESTUDIANTE APROBO EL CURSO,SU NOTA ES "+A);
         
        }else {
            
            JOptionPane.showMessageDialog(null,"EL ESTUDIANTE NO APROBO EL CURSO,SU NOTA ES "+A);
        } 
        JOptionPane.showMessageDialog(null,"UNA DE LA NOTA(S), NO CUMPLE LA CONDICION DEL RANGO 0-5");
        }
    }
    
}
