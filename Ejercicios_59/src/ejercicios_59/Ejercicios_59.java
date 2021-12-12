package ejercicios_59;

import javax.swing.JOptionPane;

public class Ejercicios_59 {

    public static void main(String[] args) {
        
        int horas=Integer.parseInt(JOptionPane.showInputDialog("POR FAVOR,INGRESE EL TIEMPO(Horas) QUE TRANSCURRIO EL CARRO:"));
        int minutos=Integer.parseInt(JOptionPane.showInputDialog("POR FAVOR,INGRESE EL TIEMPO(Minutos) QUE TRANSCURRIO EL CARRO:"));
        
        if(minutos<0) {
            
            int conversion=(horas*60)+horas;
            int a=conversion*1500;
            JOptionPane.showMessageDialog(null,"EL USUARIO DEBE PAGAR UN VALOR CORRESPONDIENTE A ="+a);
         
            }else {
            int b=horas*1500;
            JOptionPane.showMessageDialog(null,"EL USUARIO DEBE PAGAR UN VALOR CORRESPONDIENTE A ="+b);                
        } 
        
    }
    
}
