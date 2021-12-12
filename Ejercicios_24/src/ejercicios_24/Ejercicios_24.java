package ejercicios_24;

import javax.swing.JOptionPane;

public class Ejercicios_24 {

    public static void main(String[] args) {
        
        int radio=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL RADIO DEL CIRCULO:"));
        
        double area = Math.PI*Math.pow(radio,2);
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+radio+") ES LA SIGUIENTE:"+
        "\nEl Area del circulo es ="+area);
    }
    
}
