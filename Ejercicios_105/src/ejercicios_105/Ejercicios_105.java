package ejercicios_105;

import javax.swing.JOptionPane;

public class Ejercicios_105 {

    public static void main(String[] args) {
        
        int age=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad correspondiente:"));
        
        if (age>=0 && age<=5) {
            JOptionPane.showMessageDialog(null,"("+age+")años |Infante|");
        }            
        if (age>=6 && age<=10) {
           JOptionPane.showMessageDialog(null,"("+age+")años |Niño|");
        }
        if (age>=11 && age<=15) {
            JOptionPane.showMessageDialog(null,"("+age+")años |Pre-Adolescente|");
        }
        if (age>=16 && age<=18) {
            JOptionPane.showMessageDialog(null,"("+age+")años |Adolescente|");
        }
        if (age>=19 && age<=25) {
           JOptionPane.showMessageDialog(null,"("+age+")años |Pre-Adulto|");
        }
        if (age>=26 && age<=40) { 
            JOptionPane.showMessageDialog(null,"("+age+")años |Adulto|");
        }  
        if (age>=41 && age<=55) {
            JOptionPane.showMessageDialog(null,"("+age+")años |Pre-Anciano|");
        } 
        if (age>=56) {
            JOptionPane.showMessageDialog(null,"("+age+")años |Anciano|");
        }  
         
    }
    
}
