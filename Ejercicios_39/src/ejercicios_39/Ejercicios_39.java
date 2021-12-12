package ejercicios_39;

import javax.swing.JOptionPane;

public class Ejercicios_39 {

    public static void main(String[] args) {
        
        double pagar=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA COMPRA TOTAL:"));
        
        double total = pagar-(pagar*0.15);
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON EL VALOR("+pagar+") ES EL SIGUIENTE:"
        +"\nEL PRECIO TOTAL A PAGAR + EL DESCUENTO ES =$"+total+" F");
    }
    
}
