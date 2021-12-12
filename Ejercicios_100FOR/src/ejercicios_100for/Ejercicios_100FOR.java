package ejercicios_100for;

import javax.swing.JOptionPane;

public class Ejercicios_100FOR {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"La tabla multiplicar del (4)");
        
        for (int i = 1; i < 11; i++) {
            int a=i*4;
            JOptionPane.showMessageDialog(null,"Los ("+i+")*(4) ="+a);
        }
    }
    
}
