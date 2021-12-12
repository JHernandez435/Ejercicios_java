package ejercicios_25;

import javax.swing.JOptionPane;

public class Ejercicios_25 {

    public static void main(String[] args) {
        
        int diametro=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DIAMETRO DEL CIRCULO:"));
        
        double area = (Math.PI*Math.pow(diametro,2))/4;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+diametro+") ES LA SIGUIENTE:"+
        "\nEl Area del circulo es ="+area);
        
    }
    
}
