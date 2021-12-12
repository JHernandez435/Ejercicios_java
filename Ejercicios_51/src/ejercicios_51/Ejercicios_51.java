package ejercicios_51;

import javax.swing.JOptionPane;

public class Ejercicios_51 {

    public static void main(String[] args) {
        
        int num_1=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO:"));
        int num_2=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NUMERO:"));
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LOS VALORES ("+num_1+") Y ("+num_2+") ES EL SIGUIENTE :");
        int suma= num_1+num_2;
        
        if (suma<100) {
                        
            JOptionPane.showMessageDialog(null,"LA SUMA DE LOS VALORES INSERTADOS POR EL USUARIO ES ="+suma+" ES MENOR QUE (100)");
            
        }else {
            
            JOptionPane.showMessageDialog(null,"LA SUMA DE LOS VALORES INSERTADOS POR EL USUARIO ES ="+suma+" ES MAYOR QUE (100)"); 
        }
    }
    
}
