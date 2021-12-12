package ejercicios_68;

import javax.swing.JOptionPane;

public class Ejercicios_68 {

    public static void main(String[] args) {
        
        double num1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero a operar:"));
        double num2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segudo numero a operar:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA("+num1+")"+"("+num2+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
               
        if(num1<num2) {
                    
            JOptionPane.showMessageDialog(null,"EL ORDEN ASCENDENTE DE LOS NUMEROS INGRESADOS SERIA =1)"+num1+", 2)"+num2);
         
        }else{
            
            JOptionPane.showMessageDialog(null,"EL ORDEN ASCENDENTE DE LOS NUMEROS INGRESADOS SERIA =1)"+num2+", 2)"+num1);

        }  
    }
    
}
