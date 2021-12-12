package ejercicios_95for;

import javax.swing.JOptionPane;

public class Ejercicios_95FOR {

    public static void main(String[] args) {
        
            JOptionPane.showMessageDialog(null,"Los veninte multiplos del 3");
        
        for (int i = 1; i < 21; i++) {
            int a=i*3;
            JOptionPane.showMessageDialog(null,"Los ("+i+") multiplos ="+a);
        }
    }
    
}
