package ejercicios_27;

import javax.swing.JOptionPane;

public class Ejercicios_27 {

    public static void main(String[] args) {
        
        int cateto_1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PRIMER CATETO:"));
        int cateto_2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SEGUNDO CATETO:"));
        
        int hipotenusa = (cateto_1*cateto_2)/2;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+cateto_1+") y ("+cateto_2+") ES LA SIGUIENTE:"
        +"\nLa HIPOTENUSA del TRIANGULO correspondiente es ="+hipotenusa);
        
    }
    
}
