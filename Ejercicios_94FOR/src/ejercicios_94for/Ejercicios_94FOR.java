package ejercicios_94for;

import javax.swing.JOptionPane;

public class Ejercicios_94FOR {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Los veninte multiplos del 2");
        
        for (int i = 1; i < 21; i++) {
            int a=i*2;
            JOptionPane.showMessageDialog(null,"Los ("+i+") multiplos ="+a);
        }
    }
    
}
