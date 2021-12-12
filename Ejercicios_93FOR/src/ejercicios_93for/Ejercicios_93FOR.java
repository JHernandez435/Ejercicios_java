package ejercicios_93for;

import javax.swing.JOptionPane;

public class Ejercicios_93FOR {

    public static void main(String[] args) {
       
          JOptionPane.showMessageDialog(null,"EL PROGRAMA LISTARA:"
                    + "\nLOS PRIMEROS (20) NUMEROS PARES:");
        
        for (int i = 1; i < 21; i++) {
            int a=i*2;
            JOptionPane.showMessageDialog(null,"EL NUMERO ("+i+") es: "+a);
        }
    }
    
}
