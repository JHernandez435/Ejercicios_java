package ejercicios_87;

import javax.swing.JOptionPane;

public class Ejercicios_87 {

    public static void main(String[] args) {
        
        int num_1=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE LA EDAD DEL PRIMER NUMERO:"));
        int num_2=Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE LA EDAD DEL SEGUNDO NUMERO:"));
        
        if (num_1<10 && num_2<10) {
            int suma=num_1+num_2;
            JOptionPane.showMessageDialog(null,"LA SUMA ES LA SIGUIENTE"+suma);
        }
        
    }
    
}
