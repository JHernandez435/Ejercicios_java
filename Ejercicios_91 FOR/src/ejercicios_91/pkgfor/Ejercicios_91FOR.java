package ejercicios_91.pkgfor;

import javax.swing.JOptionPane;

public class Ejercicios_91FOR {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"EL PROGRAMA REALIZARA:"
                + "\nEL CONTEO DE LOS 10 PRIMEROS NUMEROS");
        
        for (int i = 1; i < 10; i++) {
            JOptionPane.showMessageDialog(null,"EL NUMERO SIGUIENTE es: "+i);
        }
    }
    
}
