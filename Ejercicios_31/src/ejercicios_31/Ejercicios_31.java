package ejercicios_31;

import javax.swing.JOptionPane;

public class Ejercicios_31 {


    public static void main(String[] args) {
        
        int distancia=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA DISTACIA A OPERAR:"));
        int tiempo=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL TIEMPO A OPERAR:"));
               
        double velocidad = distancia/tiempo;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LOS VALORES("+distancia+"),("+tiempo+")"
        +"\nLa VELOCIDAD es ="+velocidad+" V");
    }
    
}
