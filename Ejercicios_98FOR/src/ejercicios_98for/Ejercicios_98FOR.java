package ejercicios_98for;

import javax.swing.JOptionPane;

public class Ejercicios_98FOR {

    public static void main(String[] args) {
                        
        JOptionPane.showMessageDialog(null,"La tabla multiplicar del (2)");
        
        for (int i = 1; i < 11; i++) {
            int a=i*2;
            JOptionPane.showMessageDialog(null,"Los ("+i+")*(2) ="+a);
        }
    }
    
}
