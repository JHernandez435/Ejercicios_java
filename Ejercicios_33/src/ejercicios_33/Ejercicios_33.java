package ejercicios_33;

import javax.swing.JOptionPane;

public class Ejercicios_33 {

    public static void main(String[] args) {
        
        double pesos=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR(PESOS) A OPERAR:"));
        
        double conversion = pesos/3.400;
        
        JOptionPane.showMessageDialog(null,"LA CORREPONDIENTE OPERACION CON EL VALOR("+pesos+") ES LA SIGUIENTE:"
        +"\nLA CONVERSION DE PESOS A DOLARES ES ="+conversion);                       
    }
    
}
