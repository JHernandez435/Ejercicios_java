package ejercicios_29;

import javax.swing.JOptionPane;

public class Ejercicios_29 {

    public static void main(String[] args) {
       
        int Bmayor=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA BASE MAYOR DEL TRAPECIO:"));
        int Bmenor=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA BASE MENOR DEL TRAPECIO:"));
        int altura=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA ALTURA DEL TRAPECIO:"));
        
        double area = (Bmayor+Bmenor/2)*altura;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LOS VALORES(BASE MAYOR,MENOR Y ALTURA)=("+Bmayor+"),("+Bmenor+"),("+altura+")"
        +"\nEl AREA del TRAPECIO es (Bmayor+Bmenor/2)*altura)="+area);
        
    }
    
}
