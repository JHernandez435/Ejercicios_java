package ejercicios_36;

import javax.swing.JOptionPane;

public class Ejercicios_36 {

    public static void main(String[] args) {
       
        double metro=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR EN METROS A OPERAR:"));
        
        double conversion= metro*100;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON EL VALOR("+metro+") ES EL SIGUIENTE:"
        +"\n\"EL CONVERSION DE METROS A CENTIMETROS ES ="+conversion+" M");
        
    }
    
}
