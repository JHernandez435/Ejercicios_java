package ejercicios_96for;
import javax.swing.JOptionPane;
public class Ejercicios_96FOR {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Los veninte multiplos del 4");
        
        for (int i = 1; i < 21; i++) {
            int a=i*4;
            JOptionPane.showMessageDialog(null,"Los ("+i+") multiplos ="+a);
        }
    }
    
}
