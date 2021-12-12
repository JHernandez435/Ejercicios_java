package ejercicios_48;

import javax.swing.JOptionPane;

public class Ejercicios_48 {

    public static void main(String[] args) {
        
        int num_1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO:"));
        int num_2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO:"));
        
        int b= (int) Math.pow(num_1,2);
        int a= (int) Math.sqrt(num_2);  
        int reply_1=(int)Math.min(a,b);
        int reply_2=(int)Math.max(a,b);
        
        if (num_1<=num_2) {
            
            
            JOptionPane.showMessageDialog(null,"EL NUMERO ("+num_1+") ES MENOR QUE "+num_2+")"   
            +"\nEL NUMERO ("+num_1+") ELEVADO A LA (2) ES ="+b);
            
        }else {
            
            JOptionPane.showMessageDialog(null,"EL NUMERO ("+num_2+") ES MAYOR QUE ("+num_1+")" 
            +"\nLA RAIZ CUADRADA DE ("+num_2+") ES ="+a);
        }  
        
            JOptionPane.showMessageDialog(null,"EL NUMERO MINIMO ES ("+reply_1+") DE LOS DOS RESULTADOS "
            +"\nEL NUMERO MAXIMO ES ("+reply_2+") DE LOS DOS RESULTADOS");
    }
        
}
