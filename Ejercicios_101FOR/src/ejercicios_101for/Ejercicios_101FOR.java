package ejercicios_101for;

import javax.swing.JOptionPane;

public class Ejercicios_101FOR {

    public static void main(String[] args) {
       
           int tabla=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la numero de multiplicar:"));
        
        for (int i = 1; i < 11; i++) {
            int a=i*tabla;
            JOptionPane.showMessageDialog(null,"Los ("+i+")*("+tabla+") ="+a);
        }
    }
    
}
