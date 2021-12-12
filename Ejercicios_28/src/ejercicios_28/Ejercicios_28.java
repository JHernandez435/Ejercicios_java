package ejercicios_28;

import javax.swing.JOptionPane;

public class Ejercicios_28 {

    public static void main(String[] args) {
        
        int diametro=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DIAMETRO DEL CIRCUFERENCIA:"));
        
        double longitud = 2*Math.PI*diametro;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDINTE OPERACION CON EL VALOR(DIAMETRO)=("+diametro+") ES LA SIGUIENTE:"
        +"\nLa longitud de la CIRCUFERENCIA es (2*PI*"+diametro+")="+longitud);
    }
    
}
