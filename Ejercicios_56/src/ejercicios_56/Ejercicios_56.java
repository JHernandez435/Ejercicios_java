package ejercicios_56;

import javax.swing.JOptionPane;

public class Ejercicios_56 {

    public static void main(String[] args) {
       
        int num1=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO A OPERAR:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NUMERO A OPERAR:"));
        
        JOptionPane.showMessageDialog(null,"LA CORREPONDIENTE OPERACION CON LOS VALORES "+num1+" Y "+num2+" ES LA SIGUIENTE:");
        
        if(num1>num2) {
            JOptionPane.showMessageDialog(null,"EL NUMERO MAYOR ES ="+num1
            +"\nEL NUMERO MENOR ES ="+num2);
            
            }else {
                JOptionPane.showMessageDialog(null,"EL NUMERO MAYOR ES ="+num2
                +"\nEL NUMERO MENOR ES ="+num1);                 
        }      
    }
    
}
