package ejercicios_21;

import javax.swing.JOptionPane;

public class Ejercicios_21 {

    public static void main(String[] args) {
        
         int lado=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN LADO DEL CUADRADO:"));
         
         int area = (int) Math.pow(lado,2);
         
         JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACICON CON:("+lado+"),ES LA SIGUIENTE:"+
         "\nEl area del cuadrado es igual "+lado+"^2="+area+"m2");       
         
    }
    
}
