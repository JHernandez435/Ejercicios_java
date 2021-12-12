package ejercicios_34;

import javax.swing.JOptionPane;

public class Ejercicios_34 {

    public static void main(String[] args) {
        
        double pesos=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR(PESOS) A OPERAR:"));
        
        double conversion = pesos/3399;
        
        JOptionPane.showMessageDialog(null,"LA CORREPONDIENTE OPERACION CON EL VALOR("+pesos+") ES LA SIGUIENTE:"
        +"\nLA CONVERSION DE PESOS A EUROS ES ="+conversion);
        
        
    }
    
}
