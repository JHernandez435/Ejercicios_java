package ejercicios_30;

import javax.swing.JOptionPane;

public class Ejercicios_30 {

    public static void main(String[] args) {
       
        int primer=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER DATO:"));
        int segundo=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO DATO:"));
        int tercer=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL TERCER DATO:"));
        
        double media_A = (primer+segundo+tercer)/2;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERCACION CON LOS VALORES("+primer+"),("+segundo+"),("+tercer+")"
        +"\nLa MEDIA ARITMETICA es ="+media_A);
    }
    
}
