package ejercicios_53;

import javax.swing.JOptionPane;

public class Ejercicios_53 {

    public static void main(String[] args) {
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO A OPERAR:"));
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LOS VALOR ("+num+"), ES EL SIGUIENTE :");
        
        if (num%2==0) {
                        
            JOptionPane.showMessageDialog(null,"EL NUMERO INGRESADO ES PAR:("+num+")");
            
        }else {
            
            JOptionPane.showMessageDialog(null,"EL NUMERO INGRESADO ES IMPAR:("+num+")"); 
        }
    }
    
}
