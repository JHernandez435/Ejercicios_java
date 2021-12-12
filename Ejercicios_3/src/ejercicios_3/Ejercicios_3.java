package ejercicios_3;

import javax.swing.JOptionPane;

public class Ejercicios_3 {

    public static void main(String[] args) {
        
       int a=5,b=15;
       int C,D;
       double E,F,G;
     
       
       a++;
       JOptionPane.showMessageDialog(null,"A: ="+a);
       b++;
       JOptionPane.showMessageDialog(null,"B: ="+b);
       --a;
       JOptionPane.showMessageDialog(null,"C: ="+a);
       --b;
       JOptionPane.showMessageDialog(null,"D: ="+b);
       C=--b/++a;
       JOptionPane.showMessageDialog(null,"E: ="+C);
       D=a++*b++;
       JOptionPane.showMessageDialog(null,"F: ="+D);
       E=a*=a;      
       JOptionPane.showMessageDialog(null,"G: ="+E);
       F=b/=a;
       JOptionPane.showMessageDialog(null,"H: ="+F);
       G=a-=b;
       JOptionPane.showMessageDialog(null,"I: ="+G);
       
        
               
    }
    
}
