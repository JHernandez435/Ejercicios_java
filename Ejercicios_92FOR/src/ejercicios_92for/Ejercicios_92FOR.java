package ejercicios_92for;

import javax.swing.JOptionPane;

public class Ejercicios_92FOR {

    public static void main(String[] args) {
       
            JOptionPane.showMessageDialog(null,"EL PROGRAMA LISTARA:"
                    + "\nLOS PRIMEROS (20) NUMEROS IMPARES:");
        
        for (int i = 1; i < 21; i++) {
            int a=i*3;
            JOptionPane.showMessageDialog(null,"EL NUMERO ("+i+") es: "+a);
        }
    }
    
}
