package ejercicios_47;

import javax.swing.JOptionPane;

public class Ejercicios_47 {

    public static void main(String[] args) {
        
        int num_1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO:"));
        int num_2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO:"));
        
                
        if (num_1<=num_2) {
            
            JOptionPane.showMessageDialog(null,"EL NUMERO ("+num_1+") ES MENOR QUE "+num_2+")"
            +"\nEL NUMERO ("+num_1+") ELEVADO A LA (2) ES ="+ (int) Math.pow(num_1,2));
        }else {
            JOptionPane.showMessageDialog(null,"EL NUMERO ("+num_2+") ES MAYOR QUE ("+num_1+")");
        
    }
        
    }
}
