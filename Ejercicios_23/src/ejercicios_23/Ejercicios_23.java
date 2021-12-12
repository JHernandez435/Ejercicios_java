package ejercicios_23;

import javax.swing.JOptionPane;

public class Ejercicios_23 {

    public static void main(String[] args) {
        
        int diag_1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA PRIMERA DIAGONAL:"));
        int diag_2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA SEGUNDA DIAGONAL:"));
        
        int diagonal = (int) Math.sqrt(Math.pow(diag_1,2)+Math.pow(diag_2,2));
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACICON CON:("+diag_1+" y "+diag_2+"),ES LA SIGUIENTE:"+
        "El calculo de la diagonal es igual RC("+diag_1+"^2,"+diag_2+"^2  ="+diagonal);
        
    }
    
}
