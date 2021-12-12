package ejercicios_99for;

import javax.swing.JOptionPane;

public class Ejercicios_99FOR {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"La tabla multiplicar del (3)");
        
        for (int i = 1; i < 11; i++) {
            int a=i*3;
            JOptionPane.showMessageDialog(null,"Los ("+i+")*(3) ="+a);
        }
    }
    
}
