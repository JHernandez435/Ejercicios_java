package ejercicios_22;

import javax.swing.JOptionPane;

public class Ejercicios_22 {

    public static void main(String[] args) {
        
        int largo=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL LARGO DEL RECTANGULO:"));
        int ancho=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ANCHO DEL RECTANGULO:"));
        
        double perimetro = (largo+ancho)*2;

        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACICON CON:("+largo+" y "+ancho+"),ES LA SIGUIENTE:"+
        "\nEl perimetro del rectagulo es igual a la suma de sus lados "+largo+" y "+ancho+" ="+perimetro);
        
    }
    
}
