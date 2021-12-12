package ejercicios_55;

import javax.swing.JOptionPane;

public class Ejercicios_55 {

    public static void main(String[] args) {
        
        int num1=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO A OPERAR:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NUMERO A OPERAR:"));
        
        JOptionPane.showMessageDialog(null,"LA CORREPONDIENTE OPERACION CON LOS VALORES "+num1+" Y "+num2+" ES LA SIGUIENTE:");
        
        
        if (num1>0 && num2>0) {
           if (num1%num2==0) {
                        
            JOptionPane.showMessageDialog(null,"LA DIVISION ES EXACTA:");
            
        }else{
            
            JOptionPane.showMessageDialog(null,"LA DIVISION ES INEXACTA:"); 
        } 
        }else{
            JOptionPane.showMessageDialog(null,"!!! ERROR,VALOR NO ES MAYOR QUE CERO ¡¡¡¡","",JOptionPane.ERROR_MESSAGE); 
        }
        
    }
    
}
