package ejercicios_16_17_18_19;

import javax.swing.JOptionPane;

public class Ejercicios_16_17_18_19 {

    public static void main(String[] args) {
        
    int valor=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR NUMERICO:"));
        
    double raizC = Math.sqrt(valor);
    double doble = valor*2;
    double cuadrado = Math.pow(valor,2);
    double cubo = Math.pow(valor,3);
    
    JOptionPane.showMessageDialog(null,"\nLa raiz cuadrada de "+valor+", es="+raizC+
    "\nEl numero doble de "+valor+", es="+doble+
    "\nEl numero "+valor+", al cuadrado es="+cuadrado+
    "\nEl numero "+valor+", al cuadrado es="+cuadrado+
    "\nEl numero "+valor+", al cubo es="+cubo);
  

    }
    
}
