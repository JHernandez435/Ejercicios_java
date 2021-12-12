package ejercicios_37;

import javax.swing.JOptionPane;

public class Ejercicios_37 {


    public static void main(String[] args) {
        
        double kilometro=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR EN KILOMETROS A OPERAR:"));
        
        double conversion= kilometro*1000;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON EL VALOR("+kilometro+") ES EL SIGUIENTE:"
        +"\nEL CONVERSION DE KILOMETROS A METROS ES ="+conversion+" Km"); 
        
    }
    
}
