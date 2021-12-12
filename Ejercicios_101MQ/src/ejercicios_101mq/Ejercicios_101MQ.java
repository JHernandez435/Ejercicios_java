package ejercicios_101mq;

import javax.swing.JOptionPane;

public class Ejercicios_101MQ {

    public static void main(String[] args) {
        
        int tabla=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la numero de multiplicar:"));
        
        int n = 0;
        while (n<10){
            
            n=1+n;
            int a=n*tabla;
            JOptionPane.showMessageDialog(null,tabla+"*"+n+" ="+a);
        }
    }
    
}
